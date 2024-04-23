package Exercise2;

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
