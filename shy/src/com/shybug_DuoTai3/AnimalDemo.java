package com.shybug_DuoTai3;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        /*
        Cat c= new Cat();
        c.playGame();

         */
        Cat c = (Cat)a;
        c.eat();
        c.playGame();
    }
}
