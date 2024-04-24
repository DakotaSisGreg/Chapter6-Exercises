package Exercise2;

/**
 * Class: SwapperTester
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class serves as a testing environment to demonstrate the functionality of the PalindromeSwapper class.
 * It tests the swapping functionality with various data types and structures, ensuring the swap method
 * behaves as expected under different conditions. The main method provides several test cases that
 * illustrate the practical use of the swap functionality in a generic context.
 */


public class SwapperTester {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"SK Telecom T1", "Faker", "Zeus", "Oner", "Gumayusi", "Keria"};

        // Swapping elements with an Integer array
        System.out.println("Original numbers array: " + java.util.Arrays.toString(numbers));
        PalindromeSwapper.swap(numbers, 1, 3);  // Swapping elements at indices 1 and 3
        System.out.println("Swapped numbers array: " + java.util.Arrays.toString(numbers));

        // Swapping elements with a String array
        System.out.println("Original words array: " + java.util.Arrays.toString(words));
        PalindromeSwapper.swap(words, 0, 4);  // Swapping elements at indices 0 and 4
        System.out.println("Swapped words array: " + java.util.Arrays.toString(words));
    }
}
