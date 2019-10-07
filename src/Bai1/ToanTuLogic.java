package Bai1;

public class ToanTuLogic {
        public static void main(String[] args) {
            boolean i = true;
            System.out.println(System.identityHashCode(i) + " i value= " + i);
            System.out.println("==========================================");
            boolean j = false;
            System.out.println(System.identityHashCode(i) + " i value= " + i);
            System.out.println(System.identityHashCode(j) + " j value= " + j);
            System.out.println("i&&j "+(i&&j));
            System.out.println("i||j "+(i||j));
            System.out.println("!j "+(!j));
            System.out.println("==========================================");
            boolean k = true;
            System.out.println(System.identityHashCode(i) + " i value= " + i);
            System.out.println(System.identityHashCode(j) + " j value= " + j);
            System.out.println(System.identityHashCode(k) + " k value= " + k);
            System.out.println("i&&k "+(i&&k));
            System.out.println("i||k "+(i||k));
            System.out.println("!k "+(!k));
            System.out.println("==========================================");
        }
}
