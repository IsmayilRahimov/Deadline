package ScannerUtil;

import java.util.Scanner;

public class ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi bilmek ucun . Tevelludunuzu qey edin ");
        int number = scanner.nextInt();
        int age = 2025 - number;
        System.out.println(" Sizin yasiniz" + age);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("fikrinizi bildirin");
        String opinion = scanner1.nextLine();
        System.out.println("Sizin fikriniz beledir" + opinion);


    }
}
