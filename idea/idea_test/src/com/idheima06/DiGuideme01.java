package com.idheima06;

public class DiGuideme01 {
    public static void main(String[] args) {
        int jc = jc(5);
        System.out.println(jc);
    }
    public static int jc(int n){
        if(n==1){
            return 1;
        }else{
            return n*jc(n-1);
        }
    }
}
