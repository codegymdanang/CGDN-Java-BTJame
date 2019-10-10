package B1_NgonNguLapTrinhJava;

import java.util.Scanner;

public class ReadNumberToWordVN {
    static final int LILMIT = 5;

    public static void main(String[] args) {
        int number = -1;
        Scanner scanner = new Scanner(System.in, "UTF-8");
        while (number != 0) {
            System.out.println("Nhập 1 số (tối đa 9 kí tự)");
            // read the number
            number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Đọc là: Zero");
            } else {
                System.out.println("Đọc là: " + numberToWord(number));
            }
        }
    }

    private static String numberToWord(int number) {
        // variable to hold string representation of number
        String words = "";
        String unitsArray[] = {"không", "một", "hai", "ba", "bốn", "năm", "sáu",
                "bảy", "tám", "chín"};
        String extendsArray[] = {"mốt", "linh", "lăm"};
        String tensArray[] = {"mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi",
                "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
        if (number == 0) {
            return "zero";
        }
        // add minus before conversion if the number is less than 0
        if (number < 0) { // convert the number to a string
            String numberStr = "" + number;
            // remove minus before the number
            numberStr = numberStr.substring(1);
            // add minus before the number and convert the rest of number
            return "âm " + numberToWord(Integer.parseInt(numberStr));
        }
        // check if number is divisible by 1 million
        if ((number / 1000000) > 0) {
            words += numberToWord(number / 1000000) + " triệu ";
            number %= 1000000;
        }
        // check if number is divisible by 1 thousand
        if ((number / 1000) > 0) {
            words += numberToWord(number / 1000) + " ngàn ";
            number %= 1000;
        }
        // check if number is divisible by 1 hundred
        if ((number / 100) > 0) {
            words += numberToWord(number / 100) + " trăm ";
            if ((number % 100) > 0 && (number % 100) < 10) {
                words += "linh ";
            }
            if(number % 100 == 0){
                return words;
            }
            number %= 100;
        }
        if ((number / 10) == 1) {
            words += " mười ";
            number %= 10;
        }
        if ((number / 10) > 1) {
            words += numberToWord(number / 10) + " mươi " + (number % 10 == 1 ? "mốt" : (number % 10 == 0 ? "" : unitsArray[number % 10]));
            return words;
        }
        if(number %10 ==0) {
            return words;
        }


        if ((number / 10) == 0) {
            words += unitsArray[number % 10];
        }

        return words;
    }
}
