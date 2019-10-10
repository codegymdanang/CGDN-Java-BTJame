package B1_NgonNguLapTrinhJava.HienThi20SoNguyenToDauTien;

import java.util.Arrays;
import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int input = -1;
        Scanner scanner = new Scanner(System.in);
        while (input != 0) {
            System.out.println("Enter a number :");
            input = scanner.nextInt();
            hienThiGioiHanSoNguyenTO(input);
        }

    }

    public static boolean isSoNguyenTo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void hienThiGioiHanSoNguyenTO(int limit) {
        int count = 0;
        int[] array = new int[limit];
        for (int i = 2; i < Integer.MAX_VALUE && count < limit; i++) {
            if (isSoNguyenTo(i)) {
                array[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("==========================================");
//        System.out.println(Arrays.asList(array));
//        System.out.println("==========================================");
//        // #1
//        Arrays.asList(array).stream().forEach(s -> System.out.println(s));
//        System.out.println("==========================================");
//        // #2
//        Stream.of(array).forEach(System.out::println);
//        System.out.println("==========================================");
        // #3
//        Arrays.stream(array).forEach(s -> System.out.print(s + " "));
//        System.out.println("==========================================");
    }
}
