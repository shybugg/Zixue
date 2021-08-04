package com.shybug_class10;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("shy");
        p.setAge(16);
        System.out.println(p.getName()+"老师"+","+p.getAge());
        Tcachar t = new Tcachar();
        t.tcach();
        t.setName("别烦");
        t.setAge(16);
        System.out.println(t.getName()+"学生"+","+t.getAge());
        t.study();
        Tcachar t3 = new Tcachar("shybug",16);
        System.out.println(t3.getName()+"学生"+","+t3.getAge());
        t3.study();
    }
}
