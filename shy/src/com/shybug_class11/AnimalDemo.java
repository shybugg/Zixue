package com.shybug_class11;

public class AnimalDemo {
    public static void main(String[] args) {
       //创建猫
        Cat c = new Cat();
        c.setAge(5);
        c.setName("加菲猫");
        System.out.println(c.getAge()+"岁"+","+c.getName());
        c.catchMouse();

        Cat c2 = new Cat("银短猫",6);
        System.out.println(c2.getAge()+"岁"+","+c2.getName());
        c2.catchMouse();
        Dog d = new Dog();
        d.setAge(3);
        d.setName("柴犬");
        System.out.println(d.getAge()+"岁"+","+d.getName());
        d.lookDoor();
        Dog d1 = new Dog("小狗",2);
        System.out.println(d1.getAge()+"岁"+","+d1.getName());
    }
}
