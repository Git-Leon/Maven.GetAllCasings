package rocks.zipcode.io.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.BasicStringUtils;

public class GetStringNonPrimitiveCharsTest {
    @Test
    public void test1() {
        // given
        String expected = "The quick brown fox";
        test(expected);
    }

    @Test
    public void test2() {
        // given
        String expected = "jumps over the lazy dog";
        test(expected);
    }

    @Test
    public void test3() {
        // given
        String expected = "Single responsibility principle";
        test(expected);
    }

    @Test
    public void test4() {
        // given
        String expected = "Abstraction is the process of removing (superfluous) details from client-view.";
        test(expected);
    }

    private void test(String expected) {
        Character[] input = new Character[expected.length()];
        for (int i = 0; i < expected.length(); i++) {
            input[i] = expected.charAt(i);
        }

        // when
        String actual = BasicStringUtils.getString(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
