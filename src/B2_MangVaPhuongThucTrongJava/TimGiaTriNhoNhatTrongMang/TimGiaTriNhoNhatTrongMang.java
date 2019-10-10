package B2_MangVaPhuongThucTrongJava.TimGiaTriNhoNhatTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập độ dài của mảng : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            array[i] = input();
        }
        System.out.println(Arrays.toString(array));
        int min = findMinInArray(array);
        System.out.println("Phần tử nhỏ nhất : " + min);
    }

    static int findMinInArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int input() {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        return b;
    }
}
