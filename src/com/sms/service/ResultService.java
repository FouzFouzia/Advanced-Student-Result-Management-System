package com.sms.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.sms.model.Student;

public class ResultService {

    public ArrayList<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {

        System.out.print("Enter Roll No : ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Marks 1 : ");
        int m1 = sc.nextInt();

        System.out.print("Marks 2 : ");
        int m2 = sc.nextInt();

        System.out.print("Marks 3 : ");
        int m3 = sc.nextInt();

        Student student = new Student(roll, name, m1, m2, m3);
        studentList.add(student);

        System.out.println("Student Added Successfully.");
    }

    public void viewAllStudents() {

        for (Student student : studentList) {
            student.display();
        }
    }

    public void searchStudent() {

        System.out.print("Enter Roll No : ");
        int roll = sc.nextInt();

        for (Student student : studentList) {
            if (student.getRollNo() == roll) {
                student.display();
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public void updateStudent() {

        System.out.print("Enter Roll No : ");
        int roll = sc.nextInt();

        for (Student student : studentList) {

            if (student.getRollNo() == roll) {

                System.out.print("New Marks 1 : ");
                int m1 = sc.nextInt();

                System.out.print("New Marks 2 : ");
                int m2 = sc.nextInt();

                System.out.print("New Marks 3 : ");
                int m3 = sc.nextInt();

                student.updateMarks(m1, m2, m3);

                System.out.println("Updated Successfully.");
                return;
            }
        }
    }

    public void deleteStudent() {

        System.out.print("Enter Roll No : ");
        int roll = sc.nextInt();

        for (Student student : studentList) {
            if (student.getRollNo() == roll) {
                studentList.remove(student);
                System.out.println("Deleted Successfully.");
                return;
            }
        }
    }

    public void showTopper() {

        Student topper = Collections.max(studentList,
                (a, b) -> a.getTotal() - b.getTotal());

        System.out.println("===== TOPPER =====");
        topper.display();
    }
}
