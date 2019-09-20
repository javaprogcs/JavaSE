package com.fanke.javaSE.javase_2_练习_字符_常量;

/**
 * 水仙花数(自幂数)
 */
public class Hello_SE2_4 {



    public static void main(String[] args) {
        int ge,shi,bai;
        for(int i=100;i<999;i++){
            ge = i%10;//个位
            shi = i/10%10;//十位
            bai = i/100%10;//百位

            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(i);
            }
        }

        System.out.println("--------------");
        /**
         * 有若干只鸡兔同在一个笼子里，从上面数，有88个头，从下面数，有244只脚。问笼中各有多少只鸡和兔？（35/94）
         */

        //鸡x
        //兔y
        //x+y == 88
        //2*4+4*y == 244
        for(int x = 1;x <= 87; x++){
            for(int y = 1;y <= 87; y++){
                if(x + y == 88&&x*2+y*4==244){
                    System.out.println("鸡："+x+",兔："+y);
                }
            }
        }

        /**
         * 质数（prime number）又称素数，有无限个。质数定义为在大于1的自然数中，除了1和它本身以外不再有其他因数的数称为质数。
         *  1-1000之间的素数
         */

        //树旗flag;
        //921

        for(int i = 2;i<=1000;i++){
            boolean flag = true;//先假定当前就是素数
            for(int j = 2;j <=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag) System.out.println(i);

        }
    }
}
