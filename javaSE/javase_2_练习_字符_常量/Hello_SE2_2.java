package com.fanke.javaSE.javase_2_练习_字符_常量;

import java.util.Date;

/**
 * @author 成胜文
 * @Date 2019/4/1
 */
public class Hello_SE2_2 {
    /**
     * printf格式化输出
     * 语法：public PrintStream printf(
     *  String format,Object ... args
     * )
     *
     * 占位符：%[index$][标识]*[最小宽度][.精度]转换符。
     * 转换符       说明              示例
     * %5         字符串类型          "mingrisoft"
     * %c         字符类型            'm'
     * %b         布尔类型            true
     * %d         整型类型(十进制)      99
     * %x         整数类型（十六进制）   FF
     * %o         整数类型(八进制)      77
     * %f         浮点类型             99.99
     * %a         十六进制浮点类型      FF.35AE
     * %e         指数类型            9.38e+5
     * %g         通用浮点类型(f和e类型中较短的)
     * %h         散列码
     * %%         百分比类型           %
     * %n         换行符
     * %tx         日期与时间类型(x代表不同的日期与时间转换符)
     *
     */

    public static void main(String[] args) {
        //是将整数a输出；
        int a = 8976;
        System.out.printf("%d\n",a);

        //是将a以3位数整数的形式输出；
        System.out.printf("%3d\n",a);

        //是将浮点数b输出
        double b = 87.9856;
        System.out.printf("%f\n",b);

        //是将浮点数a保留两位输出;
        System.out.printf("%.2f\n",b);

        //是将浮点数a以4位形式输出，并且其中小数占两位。
        System.out.printf("%4.2f\n",b);

        //是将浮点数a以4位形式输出，并且其中小数占两位
        System.out.printf("%4.2f\n",b);


        System.out.printf("字母a的大写是：%c %n",'A');
        System.out.printf("3>7的结果是：%b%n",3>7);
        System.out.printf("100的一半是：%d %n",100/2);
        System.out.printf("100的16进制数是：%x %n",100);
        System.out.printf("100的8进制数是：%o %n",100);
        System.out.printf("50元的书打8.5折扣是：%f元%n",50*0.85);
        System.out.printf("上面价格的16进制数是：%a %n",50*0.85);
        System.out.printf("上面价格的指数表示：%e %n",50*0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n",50*0.85);
        System.out.printf("上面的折扣是%d%% %n",85);
        System.out.printf("字母A的散列码是：%h %n",'A');


        System.out.println("------------------------");

        /**
         * 格式化日期
         */
        Date now = new Date();
        String str = String.format("%tb",now);//2019/4/1
        System.out.println(str);

         /*
c，星期六 十月 27 14:21:20 CST 2007
F，2007-10-27
D，10/27/07
r，02:25:51 下午
T，14:28:16
R，14:28
b, 月份简称
B, 月份全称
a, 星期简称
A, 星期全称
C, 年前两位（不足两位补零）
y, 年后两位（不足两位补零）
j, 当年的第几天
m, 月份（不足两位补零）
d, 日期（不足两位补零）
e, 日期（不足两位不补零）
H, 24小时制的小时（不足两位补零）
k, 24小时制的小时（不足两位不补零）
I, 12小时制的小时（不足两位补零）
i, 12小时制的小时（不足两位不补零）
M, 分钟（不足两位补零）
S, 秒（不足两位补零）
L, 毫秒（不足三位补零）
N, 毫秒（不足9位补零）
p, 小写字母的上午或下午标记，如中文为“下午”，英文为pm
z, 相对于GMT的时区偏移量，如+0800
Z, 时区缩写，如CST
s, 自1970-1-1 00:00:00起经过的秒数
Q, 自1970-1-1 00:00:00起经过的豪秒
 */
    }





}
