package com.sms.auth;

import java.util.Scanner;

public class Admin {

    public boolean login() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ADMIN LOGIN =====");

        System.out.print("Username : ");
        String username = sc.nextLine();

        System.out.print("Password : ");
        String password = sc.nextLine();

        return username.equals("admin") && password.equals("1234");
    }
}
