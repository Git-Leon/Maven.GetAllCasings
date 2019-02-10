package rocks.zipcode.io;

/**
 * @author leon on 24/01/2019.
 */
public class IntegerArrayUtils {
    public static Integer[] range(Integer start, Integer end) {
        Integer delta = end - start;
        Integer[] result = new Integer[delta+1];
        for (int i = 0; i <= delta; i++) {
            result[i] = start + i;
        }
        return result;
    }
}
