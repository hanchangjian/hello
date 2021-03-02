package com.idheima08;

import java.io.*;

public class ZiFudeme01 {
    public static void main(String[] args) throws IOException{
        OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("idea_test\\ts.txt"));
        out.write("中国");
        out.close();
        InputStreamReader in=new InputStreamReader(new FileInputStream("idea_test\\ts.txt"));
        int th;
        while((th=in.read())!=-1){
            System.out.print((char)th);
        }
        in.close();

    }
}
