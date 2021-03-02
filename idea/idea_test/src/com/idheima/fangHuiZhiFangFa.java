package com.idheima;

public class fangHuiZhiFangFa {
    public static void main(String[] args) {
        boolean a=fangHuiZhi(5);
        System.out.println(a);
    }
    public static boolean fangHuiZhi(int a){
        if(a%2==0){
           return true;
        }else {
            return false;
        }
    }
}
