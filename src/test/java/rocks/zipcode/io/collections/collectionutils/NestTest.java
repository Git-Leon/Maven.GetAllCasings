package rocks.zipcode.io.collections.collectionutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.collections.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;

public class NestTest {
    @Test
    public void test1() {
        // given
        Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
        Collection<?> collection2 = Arrays.asList(5, 10, 15, 20);
        Collection<?> collection3 = Arrays.asList(10, 20, 30, 40);
        Collection<?> collection4 = Arrays.asList(15, 30, 45, 60);
        Collection<? extends Collection<?>> expected = Arrays.asList(collection1, collection2, collection3, collection4);

        // when
        Collection<? extends Collection<?>> actual = CollectionUtils.nest(collection1, collection2, collection3, collection4);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
        Collection<?> collection2 = Arrays.asList(5, 10, 15, 20);
        Collection<?> collection3 = Arrays.asList(10, 20, 30, 40);
        Collection<? extends Collection<?>> expected = Arrays.asList(collection1, collection2, collection3);

        // when
        Collection<? extends Collection<?>> actual = CollectionUtils.nest(collection1, collection2, collection3);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
        Collection<?> collection2 = Arrays.asList(5, 10, 15, 20);
        Collection<? extends Collection<?>> expected = Arrays.asList(collection1, collection2);

        // when
        Collection<? extends Collection<?>> actual = CollectionUtils.nest(collection1, collection2);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        Collection<?> collection1 = Arrays.asList(0, 1, 2, 3);
        Collection<? extends Collection<?>> expected = Arrays.asList(collection1);

        // when
        Collection<? extends Collection<?>> actual = CollectionUtils.nest(collection1);

        // then
        Assert.assertEquals(expected, actual);
    }
}
