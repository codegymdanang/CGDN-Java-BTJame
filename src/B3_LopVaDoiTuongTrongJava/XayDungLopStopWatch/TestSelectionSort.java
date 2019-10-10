package B3_LopVaDoiTuongTrongJava.XayDungLopStopWatch;

import java.util.Scanner;

public class TestSelectionSort {
    public static void main(String[] args) {
        int n = -1;
        Scanner scanner = new Scanner(System.in);
        while (n != 0) {
            System.out.println("Nhập số phần tử :");
            n = scanner.nextInt();
            int[] aray = initArray(n);
            int[] aray2 = initArray(n);
            int[] aray3 = initArray(n);
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            aray = selectionSort(aray);
            stopWatch.stop();
            long time = stopWatch.getElapsedTime();
            System.out.println(time);
            System.out.println("==========================================");

            StopWatch stopWatch2 = new StopWatch();
            stopWatch2.start();
            aray2 = bubblesort(aray2);
            stopWatch2.stop();
            long time2 = stopWatch2.getElapsedTime();
            System.out.println(time2);
            System.out.println("==========================================");

            StopWatch stopWatch3 = new StopWatch();
            stopWatch3.start();
            aray = insertSort(aray3);
            stopWatch3.stop();
            long time3 = stopWatch3.getElapsedTime();
            System.out.println(time3);
        }

    }

    public static int[] initArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        return a;
    }

    static int[] selectionSort(int[] array) {
        int min, tmp;
        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = array[j];
                    //swap
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;

                }
            }
        }
        return array;
    }

    static int[] bubblesort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    static int[] insertSort(int array[]) {
        int t, j;
        for (int i = 1; i < array.length; i++) {
            j = i - 1;
            t = array[i];
            while (j >= 0 && t < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = t;
        }
        return array;
    }
}
