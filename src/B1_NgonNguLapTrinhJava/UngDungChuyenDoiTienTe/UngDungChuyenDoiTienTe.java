package B1_NgonNguLapTrinhJava.UngDungChuyenDoiTienTe;

import java.util.Arrays;
import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double money = -1, rate = -1;
        Scanner scanner = new Scanner(System.in);
        while (money != 0) {
            System.out.println("Enter a number money :");
            money = scanner.nextDouble();
            System.out.println("Enter a number rate :");
            rate = scanner.nextDouble();
            hienThiChuyenDoi(money,rate);
        }

    }

    public static void hienThiChuyenDoi(double money, double rate) {
        System.out.println("==========================================");
        System.out.println("money(USD} : "+ money+" with rate : "+rate);
        System.out.println("change to ==> money(VND} : "+ (money*rate));
        System.out.println("==========================================");
    }
}
