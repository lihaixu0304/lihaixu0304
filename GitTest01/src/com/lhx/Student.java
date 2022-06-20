package com.lhx;

public class Student {
    private int age;
    private double height;
    private String sex;

    public Student() {

    }

    public Student(int age, double height, String sex) {
        this.age = age;
        this.height = height;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
