package com.fanke.javaSE.javase_2_练习_字符_常量;

/**
 * @author 成胜文
 * @date 2019/3/31
 * 变量、常量、字面量
 */
public class Hello_SE2_1 {

    public static void main(String[] args) {

        /**
         * 银行利率为5%，问存款100美元5年的收益细节
         */
        //变量
        int age = 100;
        age = 200;//200会把100覆盖

        //字面量
        age = age+99;//200+99
        System.out.println(age);//输出299

        //常量，不允许修改的量，final(最终的)
        final double pl = 3.14;

        System.out.println(pl*5*5);//3.14*5*5 = 78.5

        System.out.println("------------");
        /**
         *银行利率为5%，问存款100美元5年的收益细节？
         */

        //利率
        final double RATE = 0.05;

        //收益与本金
        double total = 100;

        for(int i = 1; i <= 5; i++){
            total = total*(1+RATE);

            //格式化并输出
            System.out.println("第"+i+"年："+String.format("%.2f",total));
        }


    }
}
