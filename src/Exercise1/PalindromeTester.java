package Exercise1;

import java.util.Arrays;
import java.util.List;

/**
 * Class: PalindromeTester
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class is designed to demonstrate the use of the Palindrome class.
 * It tests various strings to determine if they are palindromes and outputs the results.
 * The main purpose is to illustrate the functionality of the Palindrome implementation.
 */

public class PalindromeTester {
    public static void main(String[] args) {
        List<String> phrases = Arrays.asList(
                "Race car",
                "Madam I’m Adam.",
                "1881",
                "Amore, Roma",
                "King, are you glad you are king?",
                "Java programming",
                "Level",
                "A man, a plan, a canal, Panama"
        );

        Palindrome palindromeTester = new Palindrome();
        int palindromeCount = Counter.countIf(phrases, palindromeTester);

        System.out.println("Number of palindromes: " + palindromeCount);
    }
}