package com.fanke.javaSE.javase_1_数据类型;

/**
 * @author Java软件工程师
 * @date 2019/3/31
 * Java中常用的类型
 */
public class Hello_SE1 {

    //数字
    //整型(4个字节)
    int i1 = 100;

    //长整型（1L，8个字节）
    long i2 = 998877665544332211l;

    //短整型（2个字节）
    short i3 = 235;

    //浮点型(单精度and双精度)
    double d1 = 3.5;//双精度
    double d2 = 3;

    float f1 =(float)3.5;//单精度
    float f2 = 3.5f;//单精度

    //布尔类型boolean  true真/false假
    boolean isPass = true;
    boolean isOK = false;
    boolean isBig = 5 > 8;

    //单字符
    char f = '女';
    char m = '男';

    //字符串
    String s1 = "Hello 中文！";
    String s2 = 1 + "";//转换成String




    public static void main(String[] args) {

        //不同类型间的强制转换
        String name = "9527";
        int brother = Integer.parseInt(name) + 1;

        //输出整型9527
        System.out.println(brother);

        //字符串强转double
        double d = Double.parseDouble(name);
        Boolean.parseBoolean(name);
        float f = Float.parseFloat(name);

        Hello_SE1 se1 = new Hello_SE1();

        //结果输出通过了。
        if(se1.isPass){
            System.out.println("通过了");
        }else{
            System.out.println("未通过");
        }
    }
}
