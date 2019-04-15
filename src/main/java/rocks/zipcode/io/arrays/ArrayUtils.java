package rocks.zipcode.io.arrays;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    public static Integer[] getRange(Integer start, Integer end) {
        Integer delta = end - start;
        Integer[] result = new Integer[delta+1];
        for (int i = 0; i <= delta; i++) {
            result[i] = start + i;
        }
        return result;
    }
}
