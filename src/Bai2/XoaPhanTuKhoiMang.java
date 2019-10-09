package Bai2;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 5, 6, 8, 7, 9};
        System.out.println(Arrays.toString(array));
        System.out.println("==========================================");
        int number = -1;
        Scanner scanner = new Scanner(System.in);
        while (number != 0) {
            System.out.println("Nhập giá trị cần xóa :");
            number = scanner.nextInt();
            xoaPhanTu(array, number);
        }

    }
    public static void xoaPhanTu(int array[], int delValue) {
        int delPos = -1;
        for (int i = 0; i < array.length; i++) {
            if (delValue == array[i]) {
                delPos = i;
            }
        }
        for (int i = delPos; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array,0,newArray,0,newArray.length);
        System.out.println(Arrays.toString(newArray));
    }
}
