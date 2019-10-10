package B2_MangVaPhuongThucTrongJava.TinhTongCacSoODuongCheoCuaMaTranVuong;

import java.util.Scanner;

public class TinhTongCacSoODuongCheoChinhCuaMaTranVuong {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = -1;
        while (n!=0) {
            System.out.println("Nhập kích thước của ma trận vuông : ");
            n = scanner.nextInt();
            // khởi tạo (ma trận) mảng hai chiều arr
            int[][] array = new int[n][n];
            System.out.println("Nhập các phần tử của mảng: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = input();
                }
            }
            show(array);
            int tong = tinhTongCacSoODuongCheoChinh(array);
            System.out.println("Tổng các số ở đường chéo chính : " + tong);
        }
    }

    static int tinhTongCacSoODuongCheoChinh(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j) {
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
