package Exercise5;

/**
 * Class: UltimateTester
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class is designed to test the functionalities provided by the UltimateGeneric class. It demonstrates
 * the usage of generic methods for sorting, swapping, and displaying array elements.
 */

public class UltimateTester {
        public static void main(String[] args) {
            Double[] doubleArray = {2.3, 45.6, 4.5, 11.6, 2.0};
            Integer[] integerArray = {3, 56, 1, 12, 7, 90, 45, 23};

            // Display and sort the Double array
            System.out.println("Original Double array elements");
            UltimateGeneric.displayArray(doubleArray);
            UltimateGeneric.selectionSort(doubleArray);
            System.out.println("Double array elements after the selection sort");
            UltimateGeneric.displayArray(doubleArray);

            // Display and sort the Integer array
            System.out.println("Original Integer array elements");
            UltimateGeneric.displayArray(integerArray);
            UltimateGeneric.selectionSort(integerArray);
            System.out.println("Integer array elements after the selection sort");
            UltimateGeneric.displayArray(integerArray);
        }
    }
