package com.shybug_Xmu;

import java.util.ArrayList;

public class Student {


    //学号

    private String sic;
    //名字

    private String name;
    //年龄

    private String age;
    //居住地

    private String address;

    public Student() {
    }

    public Student(String sic, String name, String age, String address) {
        this.sic = sic;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSic() {
        return sic;
    }

    public void setSic(String sic) {
        this.sic = sic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
