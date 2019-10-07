package Bai1;

public class SoNguyenTo100 {
    static final int MAX = 100;
    public static void main(String[] args) {
        hienThiSoNguyenTo();
    }

    public static boolean isSoNguyenTo(int num) {
        for (int i = 2; i < num; i++) {
            if(num %i==0) {
                return false;
            }
        }
        return true;
    }
    public static void hienThiSoNguyenTo() {
        for (int i = 2; i < MAX; i++) {
            if(isSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
