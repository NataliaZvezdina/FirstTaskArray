package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.service.impl.ReplaceServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class ReplaceServiceImplTest {
    private ReplaceServiceImpl service = new ReplaceServiceImpl();
    private CustomArray actual = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);

    @Test
    public void testReplaceElementByIndex() throws CustomArrayException {
        // given
        int inputIndex = 2;
        int inputNewElement = 8;
        CustomArray expected = new CustomArray(3, 5, 8, 10, 19, 7, -1, 25, 2, 10);

        // when
        service.replaceElementByIndex(actual, inputIndex, inputNewElement);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceElementByIndexExceptionWhenNegativeIndex() {
        // given
        int incorrectIndex = -5;
        int newElement = 10;

        // when
        ThrowingRunnable expectedThrown = () -> service.replaceElementByIndex(actual, incorrectIndex, newElement);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testReplaceElementByIndexExceptionWhenIndexOutOfArraySize() {
        // given
        int incorrectIndex = 20;
        int newElement = 10;

        // when
        ThrowingRunnable expectedThrown = () -> service.replaceElementByIndex(actual, incorrectIndex, newElement);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }
}
