package Exercise1;

import java.util.Arrays;
import java.util.List;

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