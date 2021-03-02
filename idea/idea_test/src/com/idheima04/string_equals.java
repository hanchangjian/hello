package com.idheima04;

public class string_equals {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abcs";
        System.out.println(s1==s2);//比较字符串对象地址
        System.out.println(s1.equals(s2));//比较字符串对象内容
    }


}
