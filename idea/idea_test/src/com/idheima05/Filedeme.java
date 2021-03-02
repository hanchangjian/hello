package com.idheima05;
import java.io.*;
public class Filedeme {
    public static void main(String[] args) {
        File f1=new File("E:\\itcast1\\java.text");
        System.out.println(f1);
        File f2=new File("E:\\itcast2\\","java.text");
        System.out.println(f2);
        File f3=new File("E.\\itcast3\\");
        File f4=new File(f3,"java.text");
        System.out.println(f4);
    }
}
