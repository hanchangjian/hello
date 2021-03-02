package com.idheima08.JiHeDaoWenJiandeme;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JiHeDaoWenJiandeme {
    public static void main(String[] args) throws IOException {
        //创建一个Arraylist集合
        ArrayList<Studentdeme>  array=new ArrayList<Studentdeme>();
        //创建学生对象
        Studentdeme s1=new Studentdeme("idheima01",10,"韩1","武乡");
        Studentdeme s2=new Studentdeme("idheima02",12,"韩2","蟠龙");
        Studentdeme s3=new Studentdeme("idheima03",15,"韩3","温庄");

        //给集合添加数据
        array.add(s1);
        array.add(s2);
        array.add(s3);
        //创建字符缓冲流
        BufferedWriter wri=new BufferedWriter(new FileWriter("idea_test\\ts.txt"));
        //遍历集合
        for(Studentdeme s : array){
            //拼接成指定的格式
           StringBuilder sr=new StringBuilder();
           sr.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddmise());
           //写入数据
            wri.write(sr.toString());
            wri.newLine();//换行
            wri.flush();//刷新
        }
        wri.close();
    }
}
