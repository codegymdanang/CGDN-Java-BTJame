package Bai2;

public class Swap {
    static int c=3;
    static int d=4;
    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        swap(first, second);
        System.out.println("first == " + first);
        System.out.println("second == " + second);
        System.out.println("==========================================");
        int tmp = first;
        first=second;
        second=tmp;
        System.out.println("first == " + first);
        System.out.println("second == " + second);
        System.out.println("==========================================");
        swap(c, d);
        System.out.println("first == " + c);
        System.out.println("second == " + d);
    }

    static void swap(int a, int b) {
        int tmp = a;
        a=b;
        b=tmp;
    }
}
