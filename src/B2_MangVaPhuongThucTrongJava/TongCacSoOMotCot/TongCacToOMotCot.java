package B2_MangVaPhuongThucTrongJava.TongCacSoOMotCot;

import java.util.Scanner;

public class TongCacToOMotCot {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = -1,m=-1, col=-1;
        while (n!=0) {
            System.out.println("Nhập số hàng của ma trận: ");
            n = scanner.nextInt();
            System.out.println("Nhập số cột của ma trận: ");
            m = scanner.nextInt();
            // khởi tạo (ma trận) mảng hai chiều arr
            int[][] array = new int[n][m];
            System.out.println("Nhập các phần tử của ma trận : \n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = input();
                }
            }
            System.out.println("Nhập cột cần tính tông : ");
            col = scanner.nextInt();
            show(array);
            int tong = tinhTongCacSoOMotCot(array,col);
            System.out.println("Tổng các số ở cột "+ col +" : " + tong);
        }
    }

    static int tinhTongCacSoOMotCot(int[][] arr, int col) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j==col) {
                    total += arr[i][j];
                }
            }
        }
        return total;
    }

    static int input() {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        return b;
    }

    public static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
