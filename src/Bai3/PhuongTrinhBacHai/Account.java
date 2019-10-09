package Bai3.PhuongTrinhBacHai;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        double a =-1;
        double b =-1;
        double c =-1;
        Scanner scanner = new Scanner(System.in);
        while (a != 0) {
            System.out.println("Nhập a");
            a = scanner.nextFloat();
            System.out.println("Nhập b");
            b= scanner.nextFloat();
            System.out.println("Nhập c");
            c = scanner.nextFloat();
            QuadraticEquation ptBac2 = new QuadraticEquation(a, b, c);
            ptBac2.displayResult();
        }

    }
}
