package com.frontier;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import com.frontier.model.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.greet();

        try {
            Scanner input = new Scanner(new File("data/student.csv"));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}