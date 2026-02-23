package com.frontier.model;

public class Student {
    private String fullName, course;
    private int age;

    // getter methods
    public String getFullName() {
        return fullName;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    // setter methods
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method that greets the student
    public void greet() {
        System.out.println("Hi");
    }
}
