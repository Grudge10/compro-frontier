package com.frontier;

import java.util.*;
import java.io.*;

import com.frontier.model.Student;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader("data/students.csv"))) {
            reader.readLine(); // read the header line
            
            String line; // create string to put data

            // loop till there is no more data to be read
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // split the different variables

                Student readStudent = new Student(); // create an object for the line
                readStudent.setFullName(data[0]); // set the full name
                readStudent.setCourse(data[2]); // set the course

                // use try catch block for the parsing of integer
                try{
                    readStudent.setAge(Integer.parseInt(data[1].trim())); // set the age
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }

                students.add(readStudent); // add the student into the arraylist

                System.out.println(readStudent.getFullName());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}