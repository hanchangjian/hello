package com.idheima07;

import sun.nio.ch.IOStatus;

import java.io.*;

public class FuZhiTuPiandeme {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();//记录开始时间
//        method01();//共耗时397毫秒
      method02();//共耗时5毫秒
//        methord03();//共耗时15毫秒
       // method04();//共耗时8毫秒

        long endTime = System.currentTimeMillis();//记录结束时间
        long s = endTime - startTime;
        System.out.println("共耗时" + s + "毫秒");
    }

    //一次一个字节
    public static void method01() throws IOException {
        //读取地址D:\\学习文件\\黑马\\素材\\a0.jpg
        //写入地址idea_test\\ts.jpg
        FileOutputStream out = new FileOutputStream("idea_test\\ts.jpg");
        FileInputStream in = new FileInputStream("D:\\学习文件\\黑马\\素材\\a0.jpg");
        int by;
        while ((by = in.read()) != -1) {
            out.write(by);
        }
        out.close();
        in.close();
    }

    //一次一个数组
    public static void method02() throws IOException {
        //读取地址D:\\学习文件\\黑马\\素材\\a0.jpg
        //写入地址idea_test\\ts.jpg
        FileOutputStream out = new FileOutputStream("idea_test\\ts.jpg");
        FileInputStream in = new FileInputStream("D:\\学习文件\\黑马\\素材\\a0.jpg");
        byte[] bys = new byte[1024];
        int by;
        while ((by = in.read(bys)) != -1) {
            out.write(bys, 0, by);
        }
        out.close();
        in.close();

    }

    //缓存流一次一个字符
    public static void methord03() throws IOException {
        BufferedInputStream dis = new BufferedInputStream(new FileInputStream("D:\\学习文件\\黑马\\素材\\a0.jpg"));
        BufferedOutputStream dos = new BufferedOutputStream(new FileOutputStream("idea_test\\ts.jpg"));
        int by;
        while ((by = dis.read()) != -1) {
            dos.write(by);
        }
        dis.close();
        dos.close();
    }

    //缓存流一次一个数组
    public static void method04() throws IOException {
        BufferedInputStream dis = new BufferedInputStream(new FileInputStream("D:\\学习文件\\黑马\\素材\\a0.jpg"));
        BufferedOutputStream dos = new BufferedOutputStream(new FileOutputStream("idea_test\\ts.jpg"));
        byte[] bys = new byte[1024];
        int by;
        while ((by = dis.read(bys)) != -1) {
            dos.write(bys, 0, by);
        }
        dis.close();
        dos.close();
    }
}