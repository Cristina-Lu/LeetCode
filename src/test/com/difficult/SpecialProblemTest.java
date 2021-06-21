package com.difficult;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class SpecialProblemTest {

    /*
    * try 中都有return语句时,在执行try的return之前会执行finally中的语句
    *
    * -->致使的结果是finally语句一定会执行
    * */
    @Test
    public void tryAndFinalTest(){

        int t=10;
        System.out.println(tryAndFinal(t));
    }

    private int tryAndFinal(int t){
        try {
            t=12;
            return 5;
        }finally {
            if(t==12)
                System.out.println("执行了finally语句");
        }
    }

    /*
    * 整型包装类值的equal方法
    *
    * Integer包装类之间的比较需以equal进行，使用==会出现值相同但返回false的情况
    * */

    @Test
    public void  wrapper(){
        Integer a = 10;
        Integer b = new Integer(10);
        System.out.println(a==b);//false
        // Integer 为包装类，即引用数据类型，==号比较的是对象的内存地址
        // a的地址为IntegerCache中10的内存地址，b的地址为堆上的地址，所以两者==比较之后结果为false
        System.out.println(a.equals(b));//true
        //Integer包装类的equal是对两者的value比较，所以比较结果为true

        Integer c=120120120;
        Integer d=120120120;
        System.out.println(c==d);//false
        //IntegerCache中存储的int范围为-127~128，在这个范围外的创建，都会自动调用Integer的构造函数，
        // 会直接在堆中产生新的对象，所以二者的值并不相同

        int e = 123456;
        int f = 123456;
        System.out.println(e==f);//true
        //int类型为基础类型，==会直接比较其值是否相同

        Integer g = -127;
        Integer h = -127;
        System.out.println(h==g);//true

        Integer m = 128;
        Integer n = 128;
        System.out.println(m==n);//false

        Integer o = -129;
        Integer p = -129;
        System.out.println(o==p);//false

        Integer oo = -128;
        Integer pp = -128;
        System.out.println(oo==pp);//true


    }

    /*
    * 浮点数的等值判断
    * */

    @Test
    public void equalInFloat(){
        float a = 1.0f-0.9f;
        float b = 0.9f-0.8f;


        System.out.println(a);//0.100000024
        System.out.println(b);//0.099999964
        /*产生不一致的原因是float的精度问题*/
        System.out.println(a==b);//false

        /*常规比较法，会忽略掉精度*/
        System.out.println(Math.abs(a-b)<0.00001);//true

        /*转换比较法,这个无法忽略精度问题*/
        System.out.println(String.valueOf(a).equals(String.valueOf(b)));//false

        /*转为BigDecimal之后限制精度然后用equal*/
        BigDecimal bigDecimal1 = new BigDecimal(a);
        BigDecimal bigDecimal2 = new BigDecimal(b);
        System.out.println(bigDecimal1.equals(bigDecimal2));//false
        System.out.println(bigDecimal1.compareTo(bigDecimal2)==0);//fales

        /*从开始的时候，a和b就是不同的两个数，所以大多数比较都会得到false的结果
        * 如果开始两个值就是相同的(包括精度)，可以使用String.valueOf（）转换成String用equal计算
        * 精度不同值相同，则可以使用String.valueOf()转换成BigDecimal，然后使用compareTo进行比较
        * */

        BigDecimal bigDecimal3 = new BigDecimal("1.2");
        BigDecimal bigDecimal4 = new BigDecimal("1.20");
        /*
        * 返回0，1，-1，仅确认数值相同
        * */
        System.out.println(bigDecimal3.compareTo(bigDecimal4)==0);//true
        /*
        * equals会先确认精度是否相同，
        * 然后确认其intCompact（看表现为移除小数点后的所有数字，包括精度位）是否相同
        * */
        System.out.println(bigDecimal3.equals(bigDecimal4));//false

        Float aa = 1.0f-0.9f;
        Float bb = 0.9f-0.8f;
        /*
        * Float的equal与float的==相同，因精度问题无法获得相等的值
        * */
        System.out.println(aa.equals(bb));//false

        bigDecimal1.setScale(2,BigDecimal.ROUND_CEILING);
    }

    @Test
    public void theTestOfArraysDasList(){
        String[] strings = {"2","3","5"};
        List<String> myList = Arrays.asList(strings);
        System.out.println("myList first print:"+myList.toString());//[2,3,5],可通过Arrays.asList构造集合
        strings[1]="8";
        System.out.println("after change the strings,myList print:" +myList.toString());//[2,8,5]
        myList.set(0,"0");
        System.out.println("after change the List,strings[0] print:"+strings[0]);//0
        //即，通过Arrays.asList构造的集合属于原数组的浅拷贝。可通过更改原数组对集合中的内容进行更改，也可以通过梗概集合中的元素对原数组进行更改
        try {
            myList.add("6");
        }catch (Exception e){
            System.out.println(e.toString());//java.lang.UnsupportedOperationException
            /*
            * 调用Arrays.asList()生产的List的add、remove方法时报异常，
            * 这是由Arrays.asList() 返回的市Arrays的内部类ArrayList，而不是java.util.ArrayList。
            * Arrays的内部类ArrayList和java.util.ArrayList都是继承AbstractList，
            * remove、add等方法AbstractList中是默认throw UnsupportedOperationException而且不作任何操作。
            * java.util.ArrayList重新了这些方法而Arrays的内部类ArrayList没有重新，所以会抛出异常。
            */
        }

        //对基础数据类型的尝试
        int[] ints = {2,3,5};
        //List<int> list =  Arrays.asList(ints); 编译出错
        //List<Integer> list = Arrays.asList(ints);编译出错,原因是泛型不支持基础数据类型
        Integer[] integers ={2,3,5};
        //List<int> list = Arrays.asList(integers)；编译出错，原因是泛型不支持基础数据类型
        List<Integer> list = Arrays.asList(integers);
    }
}
