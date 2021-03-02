package com.idheima07;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShuRudeme {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream("idea_test\\ts.txt");
//        file.write(97);//写入数据,第一种
//        file.write(57);
//        file.write(55);
//        byte[] bs={97,98,99,100};//第二种
//        file.write(bs);
        byte[] bs="abcde".getBytes();//第三种
//        file.write(bs);//1
        file.write(bs,1,2);//2
        file.close();
    }
}
