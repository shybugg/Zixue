package com.shybug_Xmu;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        while (true) {
            System.out.println("-----学生娱乐系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            System.out.println("请输入你的指令：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(arr);
                    break;
                case "2":
                   // System.out.println("删除学生");
                    delStudent(arr);
                    break;
                case "3":
                   // System.out.println("修改学生");
                    updateStudent(arr);
                    break;
                case "4":
                    //System.out.println("查看学生");
                    findAllStudent(arr);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);
            }
        }
    }
    public static void addStudent(ArrayList<Student> array) {
        String sic;
            Scanner sc = new Scanner(System.in);
            while (true) {
            System.out.println("请输入学号：");
            sic = sc.nextLine();

            boolean flag = isUser(array, sic);
            if (flag) {
                System.out.println("被使用  请重新输入");
            }else
            {
                break;
            }
        }
        System.out.println("请输入学生名字：");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        String age = sc.nextLine();
        System.out.println("请输入地址");
        String address = sc.nextLine();
        Student s = new Student();
        s.setSic(sic);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("添加学生成功");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0){
            System.out.println("无信息 请添加信息");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSic()+"\t"+s.getName()+"\t\t"+s.getAge()+"岁"+"\t"+s.getAddress());
        }
    }
    public static Boolean isUser(ArrayList<Student>array,String sic){
        boolean flag = false;

        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSic().equals(sic)){
                flag = true;
                break;
            }
        }

        return flag;
    }
/*
    public static void delStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
       String sic = sc.nextLine();
       for (int i = 0; i <array.size();i++){
           Student s = array.get(i);
           if (s.getSic().equals(sic)){
               array.remove(i);
               break;
           }
       }
        System.out.println("删除成功");
    }
*/
    public static void delStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除的学号");
        String sic = sc.nextLine();
        int index = -1;
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSic().equals(sic)){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该信息不存在");
        }else
        {
            array.remove(index);
            System.out.println("删除成功");
        }
    }
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学号");
        String sic = sc.nextLine();
        System.out.println("请输入新学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入新的学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入新的地址");
        String address = sc.nextLine();
        Student s = new Student();
        s.setSic(sic);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        for (int i = 0;i< array.size();i++){
            Student student = array.get(i);
            if (student.getSic().equals(sic)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改成功");
    }
}
