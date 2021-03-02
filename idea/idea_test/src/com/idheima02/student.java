package com.idheima02;

public class student {
    String name ;
//    int age;
    private int age;
    public void setAge(int age){
        this.age = age;
        if(age>0 && age<=100){
            this.age=age;
        }else{
            System.out.println("你输入的年龄有问题");
        }
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
