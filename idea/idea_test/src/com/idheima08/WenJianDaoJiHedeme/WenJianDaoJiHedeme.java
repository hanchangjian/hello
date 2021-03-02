package com.idheima08.WenJianDaoJiHedeme;
//文件到集合

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WenJianDaoJiHedeme {
    public static void main(String[] args) throws IOException {
        //字符缓冲流
        BufferedReader rea = new BufferedReader(new FileReader("idea_test\\ts.txt"));
        //创建Arraylist集合
        ArrayList<Studentdeme> st = new ArrayList<Studentdeme>();
        //读取数据
        String list;
        while ((list = rea.readLine()) != null) {
            String[] strlist = list.split(",");//字符串分割成字符串数组
            Studentdeme s = new Studentdeme();
            s.setSid(strlist[0]);
            s.setName(strlist[1]);
            s.setAge(Integer.parseInt(strlist[2]));
            s.setAddmise(strlist[3]);
            //添加到集合
            st.add(s);

        }
        rea.close();
        for (Studentdeme s : st) {
            System.out.println(s.getSid() + "," + s.getName() + "," + s.getAge() + "," + s.getAddmise());
        }

    }
}
