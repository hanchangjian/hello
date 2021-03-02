package com.idheima08;

import java.io.*;

public class ZiFudeme06 {
    public static void main(String[] args) throws IOException{
//        BufferedWriter wri=new BufferedWriter(new FileWriter("idea_test\\ts.txt"));
//        for(int i=0;i<10;i++){
//            wri.write("hello");
//            wri.newLine();//换行
//            wri.flush();
//        }
//        wri.close();
        BufferedReader rea=new BufferedReader(new FileReader("idea_test\\ts.txt"));
        String str;
        while((str=rea.readLine())!=null){
            System.out.println(str);
        }
        rea.close();
    }
}
