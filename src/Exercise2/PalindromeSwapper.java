package Exercise2;

public class PalindromeSwapper {

    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("Index out of bounds or array is null");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}