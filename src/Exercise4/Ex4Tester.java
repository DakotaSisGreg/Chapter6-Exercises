package Exercise4;

/**
 * Class: Ex4Tester
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class serves as a comprehensive tester for the functionality provided by the PalindromeSwapperUpdated class.
 * It performs testing to ensure that the swap functionality is accurate
 */


public class Ex4Tester {

    public static void main(String[] args) {
        Integer[] numbers = {3, 5, 7, 11, 13};
        String[] words = {"Panda", "Dragon", "Lizard", "Ape", "Crab"};

        PalindromeSwapperUpdated.selectionSort(numbers);
        PalindromeSwapperUpdated.selectionSort(words);

        System.out.println("Sorted numbers: " + java.util.Arrays.toString(numbers));
        System.out.println("Sorted words: " + java.util.Arrays.toString(words));
    }
}
