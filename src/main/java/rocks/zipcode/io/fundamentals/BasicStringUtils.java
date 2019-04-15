package rocks.zipcode.io.fundamentals;

import rocks.zipcode.io.arrays.ArrayUtils;

public class BasicStringUtils {
    public static String getString(char[] chars) {
        return new String(chars);
    }

    public static String getString(Character[] chars) {
        return getString(ArrayUtils.unbox(chars));
    }

    public static String removeAllVowels(String string) {
        return removeSpecifiedCharacters(string, "aeiouAEIOU");
    }

    public static String removeSpecifiedCharacters(String string, String charactersToReplace) {
        char[] vowels = charactersToReplace.toCharArray();
        for (int i = 0; i < vowels.length; i++) {
            Character vowel = vowels[i];
            string = string.replaceAll(vowel.toString(), "");
        }
        return string;
    }
}
