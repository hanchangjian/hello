package com.idheima08;

import java.io.*;

public class HuanChongdeme {
    public static void main(String[] args) throws IOException{
//        BufferedOutputStream dos = new BufferedOutputStream(new FileOutputStream("idea_test\\ts.txt"));//缓存写入
//        dos.write("hello\r\n".getBytes());
//        dos.write("wolled\r\n".getBytes());
//        dos.close();
        BufferedInputStream dis=new BufferedInputStream(new FileInputStream("idea_test\\ts.txt"));//缓存读取
       int by;
       while((by=dis.read())!= -1){
           System.out.print((char) by);
       }
       dis.close();
    }
}
