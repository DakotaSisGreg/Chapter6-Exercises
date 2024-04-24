package Exercise1;
import java.util.Collection;

/**
 * Class: Counter
 * ITEC 2150 - 05
 *
 * author Dakota Sison Gregory
 * version 1.0
 * course ITEC 2150 Spring 2024
 * written April 23, 2024
 *
 * This class is designed to count elements in a collection that meet a specific criterion.
 * It utilizes the ITester interface to test elements for a specific condition,
 * such as determining if elements are palindromes.
 */

public class Counter {

    public static <T> int countIf(Collection<T> collection, ITester<T> tester) {
        int count = 0;
        for (T element : collection) {
            if (tester.test(element)) {
                count++;
            }
        }
        return count;
    }

}
