package com.idheima08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZiFudeme03 {
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(new FileInputStream("idea_test\\ts.txt"));
//        int ch;//一次一个字符
//    while((ch=in.read())!=-1){
//        System.out.print((char)ch);
//    }
        int ch;
        char[] chs=new char[1024];
        while((ch=in.read(chs))!=-1){
            System.out.print(new String(chs,0,ch));
        }
        in.close();
    }
}
