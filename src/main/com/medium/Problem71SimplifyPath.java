package com.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Problem71SimplifyPath {
    /*
     * 给你一个字符串 path ，表示指向某一文件或目录的 Unix 风格 绝对路径 （以 '/' 开头），
     * 请你将其转化为更加简洁的规范路径。
     * 在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..） 
     * 表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。任意多个连续的斜杠（即，'//'）都被视为单个斜杠 '/' 。 对于此问题，任何其他格式的点（例如，'...'）均被视为文件/目录名称。
     * 请注意，返回的 规范路径 必须遵循下述格式：
     *     始终以斜杠 '/' 开头。
     *     两个目录名之间必须只有一个斜杠 '/' 。
     *     最后一个目录名（如果存在）不能 以 '/' 结尾。
     *     此外，路径仅包含从根目录到目标文件或目录的路径上的目录（即，不含 '.' 或 '..'）。
     *
     * 返回简化后得到的 规范路径 。
     *
     * 思路：得到每级目录的名字，并模拟入栈出栈过程
     *
     * <使用ArrayDeque模拟栈过程，使用String.split分割字符串获得每级目录名字>
     * */
    public String simplifyPath1(String path) {
        String[] names = path.split("/");
        Deque<String> result = new ArrayDeque<>(names.length);
        for (String name : names) {
            if ("".equals(name)) {
                continue;
            } else if ("..".equals(name)) {
                if (!result.isEmpty()) {
                    result.pollLast();
                }
            } else if (".".equals(name)) {
                continue;
            } else {
                result.addLast(name);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (result.isEmpty()) {
            stringBuffer.append("/");
        } else {
            while (!result.isEmpty()) {
                stringBuffer.append("/").append(result.pollFirst());
            }
        }
        return stringBuffer.toString();
    }

    /*
     * 思路：
     * 将出入栈与获得目录名字整合到一次遍历中，以获得更快的算法
     * */

    public String simplifyPath(String path) {
        List<String> names = new ArrayList<>();
        int j = 0;//目录名字的起始位置，初始为0
        Boolean flag=false;
        for (int i = 0; i < path.length(); ++i) {
            if (path.charAt(i) == '/') {
                if (j == 0 || i==j) {
                    j = i + 1;
                } else {
                    names.add(path.substring(j, i));
                    j = 0;
                    --i;
                    flag=true;
                }
            }
            if(j<=i&&i==path.length()-1){
                names.add(path.substring(j));
                j = 0;
                flag=true;
            }
            if (flag) {
                if ("..".equals(names.get(names.size() - 1))) {
                    names.remove(names.size() - 1);
                    if (!names.isEmpty()) {
                        names.remove(names.size() - 1);
                    }
                } else if (".".equals(names.get(names.size() - 1))) {
                    names.remove(names.size() - 1);
                }
                flag=false;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (names.isEmpty()) {
            stringBuffer.append("/");
        } else {
            for (String name : names) {
                stringBuffer.append("/").append(name);
            }
        }

        return stringBuffer.toString();
    }
}
