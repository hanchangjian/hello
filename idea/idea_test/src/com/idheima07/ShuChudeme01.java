package com.idheima07;

import java.io.FileInputStream;
import java.io.IOException;

public class ShuChudeme01 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("idea_test\\ts.txt");
        byte[] by = new byte[1024];
        int len;
        while ((len=file.read(by))!=-1){
            System.out.print(new String(by,0,len));
        }
    }
}
