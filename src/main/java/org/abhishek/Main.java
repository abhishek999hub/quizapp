package org.abhishek;

import org.abhishek.ui.Useroperation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Console based Quiz Application");
        int choice;
        Useroperation useroperation = new Useroperation();
        do {
            System.out.println("1 : Login\n2 : Sign Up\n3 : Exit\nEnter choice : ");
            choice = sc.nextInt();
            String username = "";
            String password = "";
            switch (choice) {
                case 1:
                    useroperation.login(sc);
                    break;

                case 2:
                    useroperation.signup(sc);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
        }while(choice != 3);


    }
}
