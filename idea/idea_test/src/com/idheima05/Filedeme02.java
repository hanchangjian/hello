package com.idheima05;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
public class Filedeme02 {
    public static void main(String[] args) {
        File f1=new File("D:\\学习文件\\黑马\\案例\\ITcast.java");
        System.out.println(f1.isDirectory());//测试此抽象路径名表示的File是否为目录
        System.out.println(f1.isFile());//测试此抽象路径名表示的File是否为文件
        System.out.println(f1.exists());//测试此抽象路径名表示的File是否为存在
        //////////////////////////////////////////////////////////////////////
        System.out.println(f1.getAbsolutePath());//返回此抽象路径名的绝对路径名的字符串
        System.out.println(f1.getPath());//将此抽象路径名转换为路径名字符串
        System.out.println(f1.getName());//返回此抽象路径名表示的文件或目录名称
        /////////////////////////////////////////////////
        File f2 = new File("D:\\学习文件\\黑马\\案例");
        String[] strArray = f2.list();//返回所有此抽象路径名表示的文件或目录名称
        for(String str : strArray){
            System.out.println(str);
        }
        File[] fileArray=f2.listFiles();//返回所有此抽象路径名表示的文件或目录路径
        for(File file : fileArray){
            System.out.println(file);
        }
    }
}
