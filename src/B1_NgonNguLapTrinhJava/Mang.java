package B1_NgonNguLapTrinhJava;

public class Mang {
    public static void main(String[] args) {
        int[] intArray = {};
        inGiaTri(intArray);
        boolean[] boolArray = new boolean[2];
        inGiaTri_2(boolArray);
        int[] intArray2 = new int[2];
        inGiaTri(intArray2);
    }
    public static void inGiaTri(int[] array) {
        System.out.println("========================================== int array : ");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
//        for (int element : array) {
//            System.out.println(element);
//        }
        System.out.println("==========================================");
    }
    public static void inGiaTri_2(boolean[] array) {
        System.out.println("========================================== bool array : ");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========================================");
    }
}
