package Bai2;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        System.out.println(Arrays.toString(array3));
        for (int j = 0; j < array2.length; j++) {
            array3[array1.length+j] = array2[j];
        }
        System.out.println("==========================================");
        System.out.println(Arrays.toString(array3));

    }
}
