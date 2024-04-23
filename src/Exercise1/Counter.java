package Exercise1;
import java.util.Collection;


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
