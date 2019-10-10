package B2_MangVaPhuongThucTrongJava.DemSoLanXuatHienCuaKyTuTrongChuoi;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "abc";
        char find;
        Scanner scanner = new Scanner(System.in);
        while (str.length() > 0) {
            System.out.println("Nhập vào 1 chuỗi: ");
            str = scanner.nextLine();
            System.out.println("Nhập 1 kí tự cần tìm");
            find = scanner.nextLine().toCharArray()[0];
            int count = demSoLanXuatHienCuaKiTuTrongChuoi(str, find);
            System.out.println("Số lần xuất hiện của kí tự : " + find + " là " +count);
        }
    }

    private static int demSoLanXuatHienCuaKiTuTrongChuoi(String str, char find) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == find) {
                count++;
            }
        }
        return count;
    }
}
