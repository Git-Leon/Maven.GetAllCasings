package rocks.zipcode.io.fundamentals;

import rocks.zipcode.io.arrays.ArrayUtils;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        return new String(chars);
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        return getString(ArrayUtils.unbox(chars));
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        return removeSpecifiedCharacters(string, "aeiouAEIOU");
    }

    /**
     *
     * @param string - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        char[] vowels = charactersToRemove.toCharArray();
        for (int i = 0; i < vowels.length; i++) {
            Character vowel = vowels[i];
            string = string.replaceAll(vowel.toString(), "");
        }
        return string;
    }
}
