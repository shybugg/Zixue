package com.shybug_static;

public class StaticDemo {
    public static void main(String[] args) {
        Student.Un="广西大学";
        Student s1 = new Student();
        s1.name = "shy";
        s1.age = 16;
        //s1.Un = "广西大学";
        s1.show();
        Student s2 = new Student();
        s2.name ="bug";
        s2.age = 16;
        s2.show();
    }
}
