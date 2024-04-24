package Exercise5;

/**
 * Class: UltimateGeneric
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class is designed to provide a suite of generic methods that perform various operations
 * such as sorting, swapping, and displaying elements of any generic type arrays.
 * */

public class UltimateGeneric {

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T> void displayArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[smallest]) < 0) {
                    smallest = j;
                }
            }
            swap(array, i, smallest);
        }
    }

}
