package com.idheima08;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ZiFudeme04 {
    public static void main(String[] args) throws IOException {
        FileReader rea=new FileReader("idea_test\\ts.txt");
        FileWriter wri=new FileWriter("idea_test\\tss.txt");
//        int ch;//一个字节
//        while((ch=rea.read())!=-1){
//            wri.write(ch);
//        }
        char[] chs=new char[1024];
        int ch;
        while((ch=rea.read(chs))!=-1)
        {
            wri.write(chs,0,ch);
        }
        rea.close();
        wri.close();
    }

}
