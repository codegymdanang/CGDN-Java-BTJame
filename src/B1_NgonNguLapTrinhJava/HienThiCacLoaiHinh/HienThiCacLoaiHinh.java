package B1_NgonNguLapTrinhJava.HienThiCacLoaiHinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int rows = -1, cols = -1, type = -1;
        Scanner scanner = new Scanner(System.in);
        while (rows != 0 && cols != 0) {
            System.out.println("Enter type (1:inHinhChuNhat || 2:inTamGiacVuongBottomLeft || 3:inTamGiacVuongBottomLeft) :");
            type = scanner.nextInt();
            System.out.println("Enter rows :");
            rows = scanner.nextInt();
            System.out.println("Enter cols :");
            cols = scanner.nextInt();
            switch (type) {
                case 1:
                    inHinhChuNhat(rows, cols);
                    break;
                case 2:
                    inTamGiacVuongBottomLeft(rows, cols);
                    break;
                case 3:
                    inTamGiacVuongTopLeft(rows, cols);
                    break;
            }
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
                if (j > i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
