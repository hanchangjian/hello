package com.idheima01;

public class PhoneDem {
    public static void main(String[] args) {
        Phone p=new Phone();
        System.out.println(p.a);
        System.out.println(p.b);
        p.a="小米";
        p.b=5555;
        System.out.println(p.a);
        System.out.println(p.b);
        p.call();
        p.send();
    }
}
