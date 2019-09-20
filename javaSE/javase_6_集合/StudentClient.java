package com.fanke.javaSE.javase_6_集合;

import java.util.HashMap;
import java.util.Map;

public class StudentClient {

    public static void main(String[] args) {

        Stu s1=new Stu("201901","张学友","男");
        Stu s2=new Stu("201902","张汇美","女");
        Stu s3=new Stu("201903","张卫健","男");

        //创建一个Map集合<>泛型 集合中只能存方学生对象
        //键是字符类型,值是Stu类型
        Map<String,Stu> student = new HashMap();

        //添加对象
        student.put(s1.no,s1);
        student.put(s2.no,s2);
        student.put("201904",s3);

        //取集合中Key对应的元素
        student.get("201904").show();

        //遍历key
        for(String key : student.keySet()){
            System.out.println("key:"+key);
        }

        //移除
        student.remove("201904");

        //遍历Value
        for(Stu s : student.values()){
            s.show();
        }

        //移除所有
        student.clear();

        System.out.println("总个数:"+student.size());
    }
}

class Stu{

    public String no;//学号
    public String name;//姓名
    public String sex;//性别

    //构造方法
    public Stu(String no, String name, String sex) {
        this.no = no;
        this.name = name;
        this.sex = sex;
    }

    //方法
    public void show(){
        System.out.println("学号:"+no+"姓名:"+name+"性别"+sex);
    }


}
