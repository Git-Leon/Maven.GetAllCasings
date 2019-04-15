package rocks.zipcode.io;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    public static Collection<String> getAllCasings(String string) {
        PowerSet<Integer> permutator = new PowerSet<>(IntegerArrayUtils.range(0, string.length()-1));
        Set<String> list = new HashSet<>();
        for (Set<Integer> indexSet : permutator.permute()) {
            String result = upperCaseIndices(string, indexSet.toArray(new Integer[0]));
            list.add(result);
        }
        return list;
    }

    public static String upperCaseIndices(String string, Integer... indices) {
        String temp1 = string;
        for (Integer index : indices) {
            Character character = string.charAt(index);
            temp1 = replaceAtIndex(temp1, Character.toUpperCase(character), index);
        }
        return temp1;
    }

    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        return stringToBeManipulated.substring(0, index) + valueToBeInserted + stringToBeManipulated.substring(index);
    }

    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder sb = new StringBuilder(stringToBeManipulated);
        sb.setCharAt(index, replacementValue);
        return sb.toString();
    }
}