package com.shybug_YunDongYuan;

public class PerSonDome {
    public static void main(String[] args) {
        PingPangYdy p = new PingPangYdy();
        p.setAge(16);
        p.setName("shy");
        System.out.println(p.getAge() + "." + p.getName());
        p.eat();
        p.Study();
        p.speak();
    }
}
