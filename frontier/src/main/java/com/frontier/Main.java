package com.frontier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.frontier.model.Student;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader("data/students.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                Student readStudent = new Student();
                readStudent.setFullName(data[0]);
                readStudent.setAge(Integer.parseInt(data[1]));
                readStudent.setCourse(data[2]);

                
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}