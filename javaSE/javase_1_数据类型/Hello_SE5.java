package com.fanke.javaSE.javase_1_数据类型;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 方法与排序
 */
public class Hello_SE5 {

    public static void main(String[] args) {
        int a = 1,b = 2;
        int max = a>b?a:b;//三目
        /**？：表达式的作用是如果表达式1为真则返回或执行第第二个表达式
         *  否则直接返回第三个
         */
        System.out.println(max);

        //算术
        System.out.println(Math.max(9,10));

        int[] a1 = {8,9,1,3,4,5,0,-1};

        //排序
        Arrays.sort(a1);

        for(int i = a1.length-1; i >= 0; i--){
            System.out.println(a1[i]+"");
        }

        //字符，字符串比较只能用equals，==
        String x = "abc";
        System.out.println(x.equals("abc"));//基本类型
        System.out.println("abc"==x);//引用类型

        System.out.println("------------");

        /**
         * 利用递归方法求5！
         */
        int x1 = 5;
        int rs = (int) Fac(x1);

        System.out.println("" + x1 + "!=" + rs);

    }

    public static long Fac(int x){/*阶乘算法*/
        if(x > 1)
            return (x * Fac(x - 1));/*递归*/
        else
            return 1;
    }
}
