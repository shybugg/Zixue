package com.shybug_Interface2;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping a = new Cat();
        a.Jump();
        System.out.println("------------------");
        Animal an = new Cat();
        an = new Cat("加菲猫", 6);
        System.out.println(an.getAge() + "," + an.getName());
        an.eat();
        System.out.println("----------------------");
        Jumpping d = new Dog();
        d.Jump();
        Animal d1 = new Dog();
        d1.setAge(6);
        d1.setName("柴犬");
        System.out.println(d1.getAge() + "," + d1.getName());
        d1.eat();
    }
}
