package org.example;

import java.util.Scanner;

public class Deadline2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fevral ayinin 28 i veya 29 u olmasi ucun ili daxil edin");
        int number = sc.nextInt();
        int year = 2012-number;


        System.out.println("Sizin daxil etdiyiniz il" +  year);





    }
}
