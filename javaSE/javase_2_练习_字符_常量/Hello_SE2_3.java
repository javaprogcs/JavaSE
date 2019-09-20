package com.fanke.javaSE.javase_2_练习_字符_常量;

/**
 * 数据类型
 */
public class Hello_SE2_3 {


    public static void main(String[] args) {
        /*浮点数*/
        double num = 987.654321;
        System.out.println(String.format("%.2f %n",num));
        System.out.println(String.format("%a %n",num));
        System.out.println(String.format("%g %n",num));
        /*
-，在最小宽度内左对齐,不可以与0标识一起使用。
0，若内容长度不足最小宽度，则在左边用0来填充。
#，对8进制和16进制，8进制前添加一个0,16进制前添加0x。
+，结果总包含一个+或-号。
空格，正数前加空格，负数前加-号。
,，只用与十进制，每3位数字间用,分隔。
(，若结果为负数，则用括号括住，且不显示符号。
b，布尔类型，只要实参为非false的布尔类型，均格式化为字符串true，否则为字符串false。
n，平台独立的换行符, 也可通过System.getProperty("line.separator")获取。
f，浮点数型（十进制）。显示9位有效数字，且会进行四舍五入。如99.99。
a，浮点数型（十六进制）。
e，指数类型。如9.38e+5。
g，浮点数型（比%f，%a长度短些，显示6位有效数字，且会进行四舍五入）
*/
        /*$使用，索引*/
        String str = null;

        str = String.format("格式参数$的使用：%1$d,%2$s",99,"abc");
        System.out.println(str);

        int num1 = 1;
        String str2 = String.format("%04d",num1);
        System.out.println(str2);

            /*
-，在最小宽度内左对齐,不可以与0标识一起使用。
0，若内容长度不足最小宽度，则在左边用0来填充。
#，对8进制和16进制，8进制前添加一个0,16进制前添加0x。
+，结果总包含一个+或-号。
空格，正数前加空格，负数前加-号。
,，只用与十进制，每3位数字间用,分隔。
(，若结果为负数，则用括号括住，且不显示符号。
b，布尔类型，只要实参为非false的布尔类型，均格式化为字符串true，否则为字符串false。
d，整数类型（十进制）。
x，整数类型（十六进制）。
o，整数类型（八进制）
n，平台独立的换行符, 也可通过System.getProperty("line.separator")获取
         */
    }

}
