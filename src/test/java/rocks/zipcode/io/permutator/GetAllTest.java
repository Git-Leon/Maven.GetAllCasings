package rocks.zipcode.io.permutator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Permutator;

import java.util.Set;

/**
 * @author leon on 10/01/2019.
 */
public class GetAllTest {
    @Test
    public void test1() {
        Integer[] input = {0};
        test(input, "[[0], []]");
    }

    @Test
    public void test2() {
        Integer[] input = {0, 1};
        test(input, "[[0], [], [0, 1], [1]]");
    }

    @Test
    public void test3() {
        Integer[] input = {0, 0, 1};
        test(input, "[[0], [], [0, 1], [1]]");
    }


    @Test
    public void test4() {
        Integer[] input = {0, 1, 2};
        test(input, "[[0], [], [0, 1], [1], [0, 2], [2], [0, 1, 2], [1, 2]]");
    }

    @Test
    public void test5() {
        Integer[] input = {0, 1, 2, 3};
        test(input, "[[0], [], [0, 1], [1], [0, 2], [2], [0, 1, 2], [1, 2], [0, 3], [3], [0, 1, 3], [1, 3], [0, 2, 3], [2, 3], [0, 1, 2, 3], [1, 2, 3]]");
    }

    public void test(Integer[] input, String expectedAsString) {
        Permutator permutator = new Permutator(input);
        Set<Set<Integer>> actual = permutator.getAll();
        Assert.assertEquals(actual.toString(), expectedAsString);
    }
}
