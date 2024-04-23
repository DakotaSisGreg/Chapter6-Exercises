package Exercise4;

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
