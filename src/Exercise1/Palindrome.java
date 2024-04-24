package Exercise1;

/**
 * Class: Palindrome
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class is designed to check if a given string is a palindrome.
 * A palindrome is a word, phrase, number, or other sequence of characters
 * which reads the same backward as forward, ignoring spaces, punctuation, and capitalization.
 */




public class Palindrome implements ITester<String>{

    @Override
    public boolean test(String str) {
        str = str.replaceAll("[\\W_]+", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lower case
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
