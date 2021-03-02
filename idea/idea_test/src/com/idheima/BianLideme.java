package com.idheima;

import java.util.ArrayList;
import java.util.Random;

public class BianLideme {
    public static void main(String[] args) {
//        int[] a=new int[]{1,2,3};
////        for(int i=0;i<a.length;i++){
////            System.out.println(a[i]);
//            for(int i : a){
//                System.out.println(i);
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            Random ran = new Random();
            int a=ran.nextInt(10);
            list.add(a);
        }
        for(int y : list){
            System.out.println(y);
        }
        }
    }

