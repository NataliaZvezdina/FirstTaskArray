package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.service.impl.FindServiceImpl;
import org.junit.*;

import java.util.OptionalInt;

public class FindServiceImplTest {
    private FindServiceImpl service = new FindServiceImpl();
    private CustomArray testArray = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);

    @Test
    public void testFindMax() {
        // given
        int expected = 25;

        // when
        int actual = service.findMax(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMin() {
        // given
        int expected = -4;

        // when
        int actual = service.findMin(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxUsingStream() {
        // given
        OptionalInt expected = OptionalInt.of(25);

        // when
        OptionalInt actual = service.findMaxUsingStream(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMinUsingStream() {
        // given
        OptionalInt expected = OptionalInt.of(-4);

        // when
        OptionalInt actual = service.findMinUsingStream(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }
}
