package com.idheima;

public class daiCanFangFa {
    public static void main(String[] args) {
        //常量值的调用
        jiOu(4,5);
//        变量调用
        int a=2,b=3;
        jiOu(a,b);
    }
    public static void jiOu(int a,int b){
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
