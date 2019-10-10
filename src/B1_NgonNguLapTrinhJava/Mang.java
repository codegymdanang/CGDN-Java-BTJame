package B1_NgonNguLapTrinhJava;

public class Mang {
    public static void main(String[] args) {
        int[] intArray = {};
        inGiaTri(intArray);
        int[] intArray2 = new int[2];
        inGiaTri(intArray);
    }
    public static void inGiaTri(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
//        for (int element : array) {
//            System.out.println(element);
//        }
        System.out.println("==========================================");
    }
}
