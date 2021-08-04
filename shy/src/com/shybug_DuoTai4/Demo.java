package com.shybug_DuoTai4;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        a = new Cat("加菲猫",6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        Dog d = new Dog();
        d.eat();
        d.show();
    }
}
