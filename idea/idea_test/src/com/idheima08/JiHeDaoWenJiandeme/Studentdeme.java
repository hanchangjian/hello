package com.idheima08.JiHeDaoWenJiandeme;
public class Studentdeme {
    private String name;
    private int age;
    private String sid;
    private String addmise;
    public Studentdeme(){}
    public Studentdeme(String name, int age, String sid, String addmise) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.addmise = addmise;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setAddmise(String addmise) {
        this.addmise = addmise;
    }

    public String getSid() {
        return sid;
    }
    public String getAddmise() {
        return addmise;
    }
}
