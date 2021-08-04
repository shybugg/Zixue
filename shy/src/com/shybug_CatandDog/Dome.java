package com.shybug_CatandDog;

public class Dome {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setAge(6);
        a.setName("加菲猫");
        System.out.println(a.getAge()+","+a.getName());
        a.eat();
        System.out.println("----------------------");
        a = new Cat("银短",6);
        System.out.println(a.getAge()+","+a.getName());
        a.eat();
        /*
        System.out.println("--------------------------");
        Animal d = new Dog();
        d.setName("柴犬");
        d.setAge(5);
        System.out.println(d.getAge()+","+d.getName());
        d.eat();
        System.out.println("------------------------");
        d = new Dog("傻狗",6);
        System.out.println(d.getAge()+","+d.getName());
        d.eat();
         */
        Dog d =new Dog();
        d.eat();
        d.show();
    }
}
