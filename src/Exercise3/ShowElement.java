package Exercise3;

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
