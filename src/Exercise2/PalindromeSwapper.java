package Exercise2;

/**
 * Class: PalindromeSwapper
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class provides a generic method to swap elements in an array.
 * It is designed to be used in a context where swapping elements based on specific conditions,
 * such as a palindrome
 */


public class PalindromeSwapper {

    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("Index out of bounds or array is null");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
