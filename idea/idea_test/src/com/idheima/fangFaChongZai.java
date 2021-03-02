package com.idheima;

public class fangFaChongZai {
    public static void main(String[] args) {
        int a =chongZai(10,20);
        System.out.println(a);
        double b=chongZai(10.0,20.0);
        System.out.println(b);
        int c = chongZai(10,20,30);
        System.out.println(c);
    }
    public static int chongZai(int a,int b){
        return a+b;
    }
    public static double chongZai(double a,double b){
        return a+b;
    }
    public static int chongZai(int a,int b,int c){
        return a+b+c;
    }
}
