package rocks.zipcode.io.stringutils.getallcasings;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.StringUtils;

public class TwoLetterWordsTest {
    @Test
    public void test1() {
        // given
        String stringInput = "ab";
        String expected = "[Ab, ab, AB, aB]";

        // when
        Iterable<String> actual = StringUtils.getAllCasings(stringInput);


        // then
        Assert.assertEquals(expected, actual.toString());
    }

    @Test
    public void test2() {
        // given
        String stringInput = "abc";
        String expected = "[ABc, ABC, Abc, abc, aBc, AbC, abC, aBC]";

        // when
        Iterable<String> actual = StringUtils.getAllCasings(stringInput);


        // then
        Assert.assertEquals(expected, actual.toString());
    }


    @Test
    public void test3() {
        // given
        String stringInput = "abcd";
        String expected = "[abcd, aBcd, abCd, aBCd, abcD, aBcD, abCD, aBCD, ABcd, ABCd, ABcD, ABCD, Abcd, AbCd, AbcD, AbCD]";

        // when
        Iterable<String> actual = StringUtils.getAllCasings(stringInput);


        // then
        Assert.assertEquals(expected, actual.toString());
    }


    @Test
    public void test4() {
        // given
        String stringInput = "ab cd";
        String expected = "[Ab cd, Ab Cd, Ab cD, Ab CD, ab cd, ab Cd, ab cD, ab CD, AB cd, AB Cd, AB cD, AB CD, aB cd, aB Cd, aB cD, aB CD]";

        // when
        Iterable<String> actual = StringUtils.getAllCasings(stringInput);


        // then
        Assert.assertEquals(expected, actual.toString());
    }

}
