package com.idheima07;

import java.io.FileOutputStream;
import java.io.IOException;

public class ShuRuHuanHangdeme {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream("idea_test\\ts.txt",true);//末尾加true,数据追加
//     换行
        for(int i=0;i<10;i++){
         file.write("hello".getBytes());
         file.write("\r\n".getBytes());

     }
     file.close();




    }
}
