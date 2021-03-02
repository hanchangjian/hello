package com.idheima08;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ZiFudeme02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="中国";
//        byte[] bys=s.getBytes();//[-28, -72, -83, -27, -101, -67]
//        byte[] bys=s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        byte[] bys=s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));
    }
}
