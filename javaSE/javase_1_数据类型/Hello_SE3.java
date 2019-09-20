package com.fanke.javaSE.javase_1_数据类型;

import java.util.Scanner;

/**
 * 流程控制
 * @author Java软件工程师
 * @Date 2019/3/31
 */
public class Hello_SE3 {
    public static void main(String[] args) {

        //定义变量
        int n = 0;

        //条件判断
        if(n == 0){
            System.out.println("零");
        }else if(n%2==1){
            System.out.println("奇数");
        }else{
            System.out.println("偶数");
        }

        System.out.println("-------------");

        /**
         *  计算1到该数间能被3和5同时整除的数之和
         */

        //定义扫描器
        Scanner input = new Scanner(System.in);//默认的提示Alt+/

        //提示输入
        System.out.println("请输入一个数：");

        //执行输入
        int n1 = input.nextInt();
        int sum = 0;

        //循环
        for(int i = 1;i<=n1;i++){

            //判断，逻辑运算，与C一样,&&与，||或,!非
            if(i%3 == 0&&i%5 == 0){
                //累加
                sum = sum + i;
            }
        }

        System.out.println("总和是：" + sum);

        /**
         *while循环计算1到该数间能被3和5同时整除的数之和
         */
        System.out.println("请输入一个数：");
        int n2 = input.nextInt();
        int i = 1,sum1 = 0;

        while(i<n2){
            if(i%3==0&&i%5==0){
                sum1=sum1+i;
            }
            i++;
        }

        System.out.println("总和是："+sum1);

        System.out.println("-------------");
        /**
         * while循环计算1到该数间能被3和5同时整除的数之和
         */
        System.out.println("请输入一个数：");
        int n3 = input.nextInt();
        int i1 =1,sum2=0;

        while (i<=n3){
            if(i%3==0&&i%5==0){
                sum2=sum2+i;
            }
            i++;
            if(i<=15){continue;}
            System.out.println(i1);
        }

        System.out.println("总和是："+sum);
        System.out.println("i的值："+i);

        System.out.println("-------------");

        /**
         * do-while 输入年龄，介于1-100之间
         */

        int age = 0;
        String range = "";

        do{
            System.out.println("请输入年龄：");
            age = input.nextInt();
        }while(age <1 || age >100);//条件为真,循环继续

        System.out.println("年龄是："+age);

        if(age >= 0 && age <= 30){
            range = "青年";
        }else if(age >= 31 && age <= 60){
            range = "中年";
        }else if(age >= 61 && age <= 90){
            range = "老年";
        }else{
            range = "晚年";
        }

        System.out.println("年龄段是："+range);

        System.out.println("----------");


        int n4 = input.nextInt();

        if(0 <= n4 || n4 <= 99){
            System.out.println("打9折");
        }else if(100 <= n4 || n4 <= 500){
            System.out.println("打8折");
        }else if(500 > n4){
            System.out.println("7折");
        }

        System.out.println("----------------");
        /**
         * switch输入1-7输出星期一到星期天
         * 等值比较
         */
        int week = 0;
        System.out.println("请输入周：");
        week = input.nextInt();

        switch(week){//char int
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
                default:
                    System.out.println("输入错误");
                break;
        }


    }

}
