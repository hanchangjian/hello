package com.idheima08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ZiFudeme {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("idea_test\\ts.txt"));
//        out.write(97);//写入一个字节
//        out.flush();//刷新流
        char[] chs={'a','b'};
//        out.write(chs);//写入一个字符数组
//        out.write(chs,0,chs.length);//写入字符组的一部分
//        out.write("asdf");//写一个字符串
        out.write("asdf",0,"asdf".length());//字符串的一部分
        out.close();
    }
}
