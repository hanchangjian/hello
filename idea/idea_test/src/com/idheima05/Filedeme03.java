package com.idheima05;
import java.io.*;

public class Filedeme03 {
    public static void main(String[] args) {
        File f1=new File("D:\\学习文件\\黑马\\案例\\ITcast.java");
        System.out.println(f1.delete());//删除文件
        File f2=new File("D:\\学习文件\\黑马\\案例\\ITcast");
        System.out.println(f2.delete());//删除目录
    }
}
