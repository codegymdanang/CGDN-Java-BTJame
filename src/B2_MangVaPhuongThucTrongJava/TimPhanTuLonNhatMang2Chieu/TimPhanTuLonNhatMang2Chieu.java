package B2_MangVaPhuongThucTrongJava.TimPhanTuLonNhatMang2Chieu;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số hàng của ma trận: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int m = scanner.nextInt();
        // khởi tạo (ma trận) mảng hai chiều arr
        int[][] array = new int[n][m];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = input();
            }
        }
        show(array);
        int max = findMaxInArray(array);
        System.out.println("Phần tử lớn nhất : "+ max);
    }
    static int findMaxInArray(int[][] arr) {
        int max=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max<arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    static int input () {
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
