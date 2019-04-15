package rocks.zipcode.io.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.fundamentals.BasicStringUtils;

public class ReplaceAllCharacters {
    @Test
    public void test1() {
        test("ABCDEFG", "ABC", "DEFG");
    }

    @Test
    public void test2() {
        test("Mississippi", "i", "Msssspp");
    }

    @Test
    public void test3() {
        test("Mississippi", "is", "Mpp");
    }

    @Test
    public void test4() {
        test("Mississippi", "ip", "Mssss");
    }

    @Test
    public void test5() {
        test("Mississippi", "Misp", "");
    }

    private void test(String input, String charactersToReplace, String expected) {
        // given
        // when
        String actual = BasicStringUtils.replaceAllCharacters(input,charactersToReplace);

        // then
        Assert.assertEquals(expected, actual);
    }
}
