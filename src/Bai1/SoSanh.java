package Bai1;

public class SoSanh {
    public static void main(String[] args) {
        int i = 3;
        System.out.println(System.identityHashCode(i) +" i value= " + i);
        System.out.println("==========================================");
        int j = 6-3;
        System.out.println(System.identityHashCode(i) +" i value= " + i);
        System.out.println(System.identityHashCode(j) +" j value= " + j);
        System.out.println(i==j);
        System.out.println("==========================================");
        int k = 8-5;
        System.out.println(System.identityHashCode(i) +" i value= " + i);
        System.out.println(System.identityHashCode(j) +" j value= " + j);
        System.out.println(System.identityHashCode(k) +" k value= " + k);
        System.out.println(k==j);
        System.out.println(k==i);
        System.out.println("==========================================");
    }
}
