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

    public static char[] unbox(Character[] array) {
        char[] unboxedArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            char character = array[i];
            unboxedArray[i] = character;
        }
        return unboxedArray;
    }

    public static Character[] box(char[] array) {
        Character[] boxedArray = new Character[array.length];
        for (int i = 0; i < array.length; i++) {
            Character character = array[i];
            boxedArray[i] = character;
        }
        return boxedArray;
    }
}
