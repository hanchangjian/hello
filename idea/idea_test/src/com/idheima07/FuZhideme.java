package com.idheima07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FuZhideme {
    public static void main(String[] args) throws IOException {
        FileOutputStream out=new FileOutputStream("idea_test\\ts.txt");
        FileInputStream in=new FileInputStream("idea_test\\ttt.txt");
        int by;
        while ((by=in.read())!=-1){
            out.write(by);
        }
        out.close();
        in.close();

    }
}
