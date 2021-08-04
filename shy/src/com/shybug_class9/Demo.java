package com.shybug_class9;

public class Demo {
    public static void main(String[] args) {
        Teachar t =  new Teachar();
        t.setName("别烦");
        t.setAge(16);
        System.out.println(t.getName()+","+t.getAge());
        t.teach();
        Teachar t2 = new Teachar("shy",17);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
    }
}
