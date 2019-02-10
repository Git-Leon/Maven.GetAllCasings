package rocks.zipcode.io.permutator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Permutator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 24/01/2019.
 */
public class GetOriginalArrayTest {
    @Test
    public void test1() {
        test(0);
    }

    @Test
    public void test2() {
        test(0,1);
    }

    @Test
    public void test3() {
        test(0,0,1);
    }


    @Test
    public void test4() {
        test(0,1,2);
    }

    @Test
    public void test5() {
        test(0,1,2,3);
    }

    public void test(Integer... input) {
        Set<Integer> expected = new HashSet<>(Arrays.asList(input));
        Permutator permutator = new Permutator(input);
        Assert.assertEquals(expected, permutator.getOriginalSet());
    }
}