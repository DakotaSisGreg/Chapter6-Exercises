package Exercise3;

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
