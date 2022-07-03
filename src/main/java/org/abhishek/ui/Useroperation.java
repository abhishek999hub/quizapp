package org.abhishek.ui;

import java.util.Scanner;

public class Useroperation {
    String username;
    String password;
    public void login(Scanner sc)
    {
        System.out.println("Enter username : ");
        username = sc.nextLine();
        System.out.println("Enter password : ");
        password = sc.nextLine();

    }
    public void signup(Scanner sc)
    {
        System.out.println("Enter username : ");
        username = sc.nextLine();
        System.out.println("Enter password : ");
        password = sc.nextLine();
    }
}
