package org.example;

import java.util.Scanner;

public class Deadline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Days");
        int days = sc.nextInt();

        switch (days) {
            case 1:
                System.out.println("One");
                System.out.println("ise getmek");
                break;
            case 2:
                System.out.println("Two");
                System.out.println("Gezinti");
                break;
            case 3:
                System.out.println("Three");
                System.out.println("Futbol oynamaq");
                break;
            case 4:
                System.out.println("Four");
                System.out.println("Axsam yemeyine getmek");
                break;
            case 5:
                System.out.println("Five");
                System.out.println("Denize getmek");
                break;
            case 6:
                System.out.println("Six");
                System.out.println("Sinemaya getmek");
                break;
            case 7:
                System.out.println("Seven");
                System.out.println("Kitab oxumaq");
                break;
            default:
                System.out.println("Not a valid number");

        }

    }
}
