package com.shybug_Args1;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator a = new AnimalOperator();
        Animal aa = new Cat();
        a.useAnimal(aa);
        Animal a2 =  a.getAnimal();
        a2.eat();
    }
}
