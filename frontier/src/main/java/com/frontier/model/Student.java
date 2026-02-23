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

    // method that greets the student
    public void greet() {
        System.out.println("Hi");
    }
}
