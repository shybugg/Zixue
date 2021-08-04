package com.shybug_ChouXiang3;

public class AnimalDome {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("-------------------");
        a = new Cat("加菲",6);
        System.out.println(a.getName()+","+a.getAge());
        Animal d = new Dog();
        d.setAge(5);
        d.setName("柴犬");
        System.out.println(d.getName()+","+d.getName());
        d.eat();
        System.out.println("----------------");
        d = new Dog("傻狗",1);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
    }
}
