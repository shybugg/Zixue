package com.shybug_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDome05 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        addStudent(array);
        addStudent(array);
        addStudent(array);
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
       /*
        Scanner sc = new Scanner(System.in);

        System.out.println("输入学生姓名：");
        String name =sc.nextLine();
        System.out.println("输入学生年龄：");
        String age = sc.nextLine();
        Student s = new Student();
       s.setName(name);
       s.setAge(age);
        array.add(s);
        */
        //改进
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("输入学生年龄：");
        String age = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        array.add(s);
    }
}

