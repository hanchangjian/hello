package com.idheima08;

import java.io.*;

//缓冲字符
public class ZiFudeme05 {
    public static void main(String[] args) throws IOException {

//        BufferedWriter wri=new BufferedWriter(new FileWriter("idea_test\\ts.txt"));
//        wri.write("hello\r\n");
//        wri.write("world\r\n");
//        wri.close();
        BufferedReader rea=new BufferedReader(new FileReader("idea_test\\ts.txt"));
        int ch;
        while((ch=rea.read())!=-1){
            System.out.print((char)ch);
        }

    }
}
