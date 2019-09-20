package com.fanke.javaSE.javase_1_数据类型;

import java.util.Scanner;

/**
 * 数组
 */
public class Hello_SE4 {
    public static void main(String[] args) {

        /**
         * 一维数组
         */
        int[] a = new int[10];
        for(int i=0;i < a.length;i++){
            a[i]=i*i;//0*0,1*1,2*2....
            System.out.println(a[i]);
        }

        System.out.println("-----------");
        /**
         * 求平均成绩与总分
         *
         */

        Scanner input = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i]=input.nextInt();
        }

        //遍历数组
        for(int i=0;i<scores.length;i++){
            sum = sum+scores[i];
        }

        System.out.println("总分是："+sum+",平均分："+(sum/scores.length));

        System.out.println("-------------");
        /**
         * 二维数组
         */
        int[][]a1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        //取值范围在下标从0开始到2结束
        System.out.println(a1[0][2]);

        for(int j = 0;j<a1.length;j++){//行

            for(int k = 0;k < a1[j].length;k++){//列
                System.out.println(a1[j][k]+"");
            }
            System.out.println();
        }

        /**
         * 二维数组赋值
         */
        int sum1 = 0;
        int[][] a2 = new int[3][2];

        for(int i=0;i<a2.length;i++){
            for(int j = 0;j < a2[i].length;j++){
                System.out.println("请输入a["+i+"]["+j+"]=");
                a2[i][j]=input.nextInt();
            }
        }

        for(int i = 0;i < a2.length;i++){
            for(int j = 0;j < a2[i].length;j++){
                sum1+=a2[i][j];
            }
        }

        System.out.println(sum1);

        /**
         * 二维数组应用
         */

        //统计平均成绩
        //实例化（创建）行为3的数组，列为2的数组
        double[][] scores1 = new double[3][2];
        double sum2 = 0;
        int n = 0;//个数，输入

        //scores.length数组的长度
        for(int i = 0; i < scores1.length; i++){
            for(int j = 0; j <scores1[i].length; j++){
                scores1[i][j] = input.nextDouble();
                n++;
            }
        }

        //遍历数组
        for(int i = 0; i < scores1.length; i++){
            for(int j = 0; j < scores1[i].length; j++){
                sum2 += scores1[i][j];
            }
        }

        System.out.println("总分是："+sum2+",平均分："+sum2/n);
    }
}
