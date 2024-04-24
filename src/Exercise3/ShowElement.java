package Exercise3;

/**
 * Class: ShowElement
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class provides a generic method to display all elements of an array.
 * It is designed to showcase how generics can be utilized to create flexible methods
 * that can handle any type of array
 */

public class ShowElement {

    public static <T> void displayArray(T[] array) {
        if (array == null) {
            System.out.println("Array is null");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]); // Display current element
            if (i < array.length - 1) {
                System.out.print(", "); // Print a comma except after the last element
            }
        }
        System.out.println("]");
    }

}
