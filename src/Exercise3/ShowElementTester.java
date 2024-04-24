package Exercise3;

/**
 * Class: ShowElementTester
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class serves as a test case for the ShowElement class.
 * It tests the displayArray method with arrays of different types to ensure
 * that it functions correctly across a variety of data types. The main method
 * provides use cases that demonstrate the utility and flexibility of the displayArray method.
 */


public class ShowElementTester {

    public static void main(String[] args) {
        Integer[] numbers = {12, 23, 32, 47, 59};
        String[] words = {"Nomad", "Thermite", "Ghost"};
        Double[] doubles = {3.14, 4.20, 5.67, 13.23};

        // Shows the Integer array
        System.out.print("Numbers array: ");
        ShowElement.displayArray(numbers);

        // Shows the String array
        System.out.print("Words array: ");
        ShowElement.displayArray(words);

        // Shows the Double array
        System.out.print("Doubles array: ");
        ShowElement.displayArray(doubles);
    }

}
