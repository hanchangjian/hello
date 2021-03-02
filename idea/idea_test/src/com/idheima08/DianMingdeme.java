package com.idheima08;
//点名器
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class DianMingdeme {
    public static void main(String[] args) throws IOException {
        BufferedReader rea = new BufferedReader(new FileReader("idea_test\\ts.txt"));
        ArrayList<String> list=new ArrayList<String>();
        String lin;
        while((lin=rea.readLine())!=null){
            list.add(lin);
        }
        rea.close();
        Random ran=new Random();//实例化一个随机数
        int index=ran.nextInt(list.size());
        String s=list.get(index);
        System.out.println(s);
    }
}
