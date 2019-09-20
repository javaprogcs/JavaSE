package com.fanke.javaSE.javase_6_集合;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

    public static void main(String[] args) {

        //定义list1集合,指定存放的数据类型,只能是引用类型
        List<Integer> list1 = new ArrayList();

        //添加单个元素
        Integer n = 88;
        list1.add(98);
        list1.add(99);
        list1.add(60);
        list1.add(n);

        //获得单个元素
        int e1 = list1.get(0);//98
        System.out.println("list1的第2个元素值为:"+list1.get(1));

        //获得集合长度
        System.out.println("长度为："+list1.size());

        //遍历1
        for(Integer item : list1){
            System.out.println("遍历:"+item);
        }

        //遍历2
        for(int i = 0;i < list1.size(); i++){
            System.out.println(i+"="+list1.get(i));
        }

        //移除
        //将下标为0的元素移除,当前面的元素移除时后面补上
        list1.remove(0);
        System.out.println("list1的第1个元素值为:"+list1.get(0));

        //指定要移除的对象,把集合中的60移除
        list1.remove(n);
        //移除所有
        list1.clear();

        //获得集合长度
        System.out.println("长度为:"+list1.size());
    }
}
