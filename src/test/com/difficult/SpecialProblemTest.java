package com.difficult;

import org.junit.Test;

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
}
