package Exercise4;

public class PalindromeSwapperUpdated {

    /**
     * Swaps two elements in an array.
     * <T> The type of the elements in the array.
     * array The array where the swap is to be performed.
     * index1 The index of the first element to be swapped.
     * index2 The index of the second element to be swapped.
     */


    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("Index out of bounds or array is null");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Sorts an array using the selection sort algorithm with a generic type.
     * <T> The type of the elements in the array, which must extend Comparable<T>
     * array The array to be sorted.
     */

    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[smallest]) < 0) {
                    smallest = j;
                }
            }
            swap(array, i, smallest);  // Use the generic swap method
        }
    }
}


