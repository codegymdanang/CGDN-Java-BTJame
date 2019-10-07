package Bai2;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int position = -1;
        int giaTriMoi = -1;
        int[] array = {5, 7, 8, 1, 5, 4, 9, 3, 6};
        int[] arrayNew = Arrays.copyOf(array,array.length+1);
        System.out.println(Arrays.toString(arrayNew));
        Scanner scanner = new Scanner(System.in);
        String ketQua = "";
        while (giaTriMoi != 0) {
            System.out.println("Enter a pos :");
            position = scanner.nextInt();
            System.out.println("Enter a newValue :");
            giaTriMoi = scanner.nextInt();
            ketQua = themPhanTuVaoMang(arrayNew, position, giaTriMoi);
            System.out.println(ketQua);
        }
    }

    public static String themPhanTuVaoMang(int[] a, int pos, int newValue) {
        if (pos <= 1 || pos >= a.length - 1) {
            return "không được chèn phần tử vào mảng ";
        }
        for (int i = a.length-1; i >= pos ; i--) {

            a[i] = a[i-1];
            if (i == pos) {
                a[pos] = newValue;
            }
        }
        return Arrays.toString(a);
    }

}
