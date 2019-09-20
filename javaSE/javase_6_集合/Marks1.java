package com.fanke.javaSE.javase_6_集合;

import java.util.ArrayList;
import java.util.List;

public class Marks1 {

    public static void main(String[] args) {

        //数组
        int[] scores = new int[100];
        //scores[200] = 99;

        //泛型集合
        List<Integer> marks1 = new ArrayList<Integer>();
        marks1.add(98);
        marks1.add(89);
        marks1.add(59);

        System.out.println(marks1.get(2)+1);

        //非泛型类型
        List marks2 = new ArrayList();
        marks2.add(98);
        marks2.add(9.8);
        marks2.add("九十九");

        //非泛型有安全隐患
        System.out.println(Integer.parseInt(marks2.get(2)+"")+1);

    }
}
