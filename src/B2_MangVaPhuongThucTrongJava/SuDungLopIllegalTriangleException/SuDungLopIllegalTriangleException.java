package B2_MangVaPhuongThucTrongJava.SuDungLopIllegalTriangleException;

import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = -1, b = -1, c = -1;
        while (a!=0) {
            System.out.println("Nhập cạnh thứ 1: ");
            a = scanner.nextInt();
            System.out.println("Nhập cạnh thứ 2: ");
            b = scanner.nextInt();
            System.out.println("Nhập cạnh thứ 3: ");
            c = scanner.nextInt();
            System.out.println("Nhập cột cần tính tông : ");
            try {
                kiemTraLoiTamGia(a,b,c);
            } catch (IllegalTriangleException e) {
                System.out.println("bị lỗi IllegalTriangleException");
            }
        }
    }

    static void kiemTraLoiTamGia(int a,int b,int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0 || (a + b) < c || (a + c) < b || (b + c) < a) {
            throw new IllegalTriangleException();
        }
    }

    static int input() {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        return b;
    }
}
