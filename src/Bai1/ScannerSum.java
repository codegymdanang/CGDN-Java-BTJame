package Bai1;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        sum();
    }
    public static void sum() {
        int sum = 0;
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number :");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("The sum is : " + sum);
    }
}
