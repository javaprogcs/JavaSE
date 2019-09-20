package com.fanke.javaSE.javase_1_数据类型;

import java.util.Scanner;

/**
 * @author Java软件工程师
 * @Date 2019/3/31
 * 输入与包
 */
public class Hello_SE2 {

    public static void main(String[] args) {

        //定义扫描器
        Scanner input = new Scanner(System.in);

        //定义变量
        int n = input.nextInt();//等待输入

        //String name = input.next();//输入字符
        //float mark = input.nextFloat();//输入单精度数字
        //double pi = input.nextDouble();//输入双精度数字

        //条件判断
        if(n == 0){
            System.out.println("零");
        }else if(n%2==1){//如果一个数与2求余为1
            System.out.println("奇数");
        }else{
            System.out.println("偶数");
        }

        System.out.println("============");
        //输出3位数到指定数之间的中能同时被3或5整除的数
        System.out.println("请输入n：");
        //从键盘输入
        int n1 = input.nextInt();

        for(int i = 100;i<= n1;i++){
            if(i%3==0&&i%5==0){
                System.out.println(i);
            }
        }

        System.out.println("---------------");
        //定义变量
        int n2 = input.nextInt();//等待输入

        //String name = input.next();//输入字符
        //float mark = input.nextFloat();//输入单精度数字
        //double pi = input.nextDouble();//输入双精度数字

        //条件判断
        if(n2 == 0){
            System.out.println("零");
        }else if(n2%2==1){//如果一个属与2求余为1
            System.out.println("奇\t数");//'\t是换行符'
        }else{
            System.out.println("偶数");
        }

    }
}
