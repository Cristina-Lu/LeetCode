package com.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem399EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int equationsSize = equations.size();

        weightMap unionFind = new weightMap(2 * equationsSize);
        // 第 1 步：预处理，将变量的值与 id 进行映射，使得并查集的底层使用数组实现，方便编码
        Map<String, Integer> hashMap = new HashMap<>(2 * equationsSize);
        int id = 0;
        for (int i = 0; i < equationsSize; i++) {
            List<String> equation = equations.get(i);
            String var1 = equation.get(0);
            String var2 = equation.get(1);

            if (!hashMap.containsKey(var1)) {
                hashMap.put(var1, id);
                id++;
            }
            if (!hashMap.containsKey(var2)) {
                hashMap.put(var2, id);
                id++;
            }
            unionFind.setValue(hashMap.get(var1), hashMap.get(var2), values[i]);
        }
        double[] result = new double[queries.size()];
        for (int i =0;i<queries.size();++i){
            List<String> querie = queries.get(i);
            Integer id1 = hashMap.get(querie.get(0));
            Integer id2 = hashMap.get(querie.get(1));
            if(id1 ==null || id2 == null){
                result[i] = -1.0d;
            }else {
                result[i] = unionFind.getValue(id1,id2);
            }
        }
        return result;
    }

    /*有向带权重的图的数据结构，parent记录两个点的距离，weight记录对应的两个点的权重*/
    public class weightMap{
        int[] parent;
        double[] weight;

        public weightMap(int n){
            this.parent = new int[n];
            this.weight = new double[n];
            for(int i=0;i<n;++i){
                parent[i] = i;
                weight[i] = 1.0d;
            }
        }

        public void setValue(int x,int y,double value){
            int rootX = findWeight(x);
            int rootY = findWeight(y);
            if(rootX == rootY){
                return;
            }
            parent[x] = rootY;
            weight[rootX] = weight[y] * value / weight[x];
        }
        public int findWeight(int x){
            if (x != parent[x]){
                int origin = parent[x];
                parent[x] = findWeight(parent[x]);
                weight[x] = weight[x]*weight[origin];
            }
            return parent[x];
        }
        public double getValue(int x,int y){
            int rootX = findWeight(x);
            int rootY = findWeight(y);
            if(rootX == rootY){
                return weight[x]/weight[y];
            }else {
                return -1.0d;
            }
        }
    }
}
