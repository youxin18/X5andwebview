package com.yxx.x5x5;

public class Name {
    private int age=1;
    private String sex="男";
    private String name="张三";
    public String member="me";
    public String member1="you";

    public Name(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }
    public Name(){

    }

    public int getA() {
        return age;
    }

    public void setA(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input(String name,String sex){

      System.out.println("我的名字是:"+name);
       System.out.println("我的性别是:"+sex);
       // System.out.println("我的年龄是:"+age);


    }
}
