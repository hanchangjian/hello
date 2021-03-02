package com.idheima07;

import java.io.FileInputStream;
import java.io.IOException;

public class ShuChudeme {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("idea_test\\ts.txt");
//        int fi = file.read();
//        System.out.println(fi);
//        System.out.println((char)fi);//单个字符
//        int fi = file.read();//循环读取
//        while(fi != -1){
//            System.out.print((char)fi);
//           fi=file.read();
//        }
        int fi;//优化循环读取
        while((fi=file.read()) != -1){
            System.out.print((char)fi);
        }
        file.close();

    }
}
