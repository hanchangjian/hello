package com.idheima05;
import java.io.*;
//createNewFile创建文件，mkdirs，mkdir创建目录
public class Filedeme01 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\学习文件\\黑马\\案例\\ITcast.java");
        System.out.println(f1.createNewFile());//createNewFile方法文件存在返回false，不存在创建文件返回true
        File f2=new File("D:\\学习文件\\黑马\\案例\\itcast");
        System.out.println(f2.mkdir());//mkdir方法目录存在返回false，不存在创建目录返回true
        File f3=new File("D:\\学习文件\\黑马\\案例\\itcas\\java.text");
        System.out.println(f3.mkdirs());//mkdirs方法创建多级目录
    }
}
