package Bai1;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int rows = -1,cols =-1;
        Scanner scanner = new Scanner(System.in);
        while (rows != 0 && cols != 0) {
            System.out.println("Enter rows :");
            rows = scanner.nextInt();
            System.out.println("Enter cols :");
            cols = scanner.nextInt();
            //inHinhChuNhat(rows, cols);
            //inTamGiacVuongBottomLeft(rows, cols);
            inTamGiacVuongTopLeft(rows, cols);
        }
    }

    public static void inHinhChuNhat(int cols, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inTamGiacVuongBottomLeft(int cols, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j <= i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void inTamGiacVuongTopLeft(int cols, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = cols; j > 0; j--) {
                if(j>i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
