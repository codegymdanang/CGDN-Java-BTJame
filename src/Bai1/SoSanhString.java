package Bai1;

public class SoSanhString {
    public static void main(String[] args) {
        String i = "3";
        System.out.println(System.identityHashCode(i) + " i value= " + i);
        System.out.println("==========================================");
        String j = new String("3");
        System.out.println(System.identityHashCode(i) + " i value= " + i);
        System.out.println(System.identityHashCode(j) + " j value= " + j);
        System.out.println(i == j);
        System.out.println("i==j " + (i == j));
        System.out.println("==========================================");
        String k = "3";
        System.out.println(System.identityHashCode(i) + " i value= " + i);
        System.out.println(System.identityHashCode(j) + " j value= " + j);
        System.out.println(System.identityHashCode(k) + " k value= " + k);
        System.out.println("k==j " + (k == j));
        System.out.println("k.equals(j) " + (k.equals(j)));
        System.out.println("k==i " + (k == i));
        System.out.println("==========================================");
    }
}
