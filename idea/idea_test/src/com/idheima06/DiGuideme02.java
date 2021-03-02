package com.idheima06;
import java.io.*;
public class DiGuideme02 {
    public static void main(String[] args) {
        File scrfile=new File("D:\\学习文件\\黑马\\案例");
        getAllFilePath(scrfile);
    }
    public static void getAllFilePath(File scrfile){
       File[] fileArrey=scrfile.listFiles();//获取改定的file目录下所有的文件或目录的file数组
        //遍历File数组,得到每一个file对象
       if(fileArrey!=null){
           for(File file : fileArrey){
               //判断是否为目录
               if(file.isDirectory()){
                   getAllFilePath(file);//是，递归调用
               }else{
                   System.out.println(file.getAbsolutePath());//不是,返回绝对地址
               }
           }
       }
    }
}
