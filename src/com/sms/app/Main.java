package com.sms.app;

import java.util.Scanner;

import com.sms.auth.Admin;
import com.sms.service.ResultService;
import com.sms.util.FileManager;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin();

        if (!admin.login()) {
            System.out.println("Invalid Login.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        ResultService service = new ResultService();
        FileManager file = new FileManager();

        service.studentList = file.loadData();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Topper");
            System.out.println("7. Save");
            System.out.println("8. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.addStudent();
                    break;

                case 2:
                    service.viewAllStudents();
                    break;

                case 3:
                    service.searchStudent();
                    break;

                case 4:
                    service.updateStudent();
                    break;

                case 5:
                    service.deleteStudent();
                    break;

                case 6:
                    service.showTopper();
                    break;

                case 7:
                    file.saveData(service.studentList);
                    System.out.println("Saved Successfully.");
                    break;

                case 8:
                    file.saveData(service.studentList);
                    System.out.println("Thank You.");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}