import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.service.impl.ReplaceServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class ReplaceServiceImplTest {
    private ReplaceServiceImpl service;

    @Before
    public void setUp() {
        service = new ReplaceServiceImpl();
    }

    @Test
    public void testReplaceElementByIndex_happyPath() throws CustomArrayException {
        // given
        CustomArray actual = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int inputIndex = 2;
        int inputNewElement = 8;
        CustomArray expected = new CustomArray(3, 5, 8, 10, 19, 7, -1, 25, 2, 10);

        // when
        service.replaceElementByIndex(actual, inputIndex, inputNewElement);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceElementByIndex_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;
        int correctIndex = 5;
        int newElement = 10;

        // when
        ThrowingRunnable expectedThrown = () -> service.replaceElementByIndex(actual, correctIndex, newElement);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testReplaceElementByIndex_whenInputIndexNegative_thenThrowCustomArrayException() {
        // given
        CustomArray actual = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int incorrectIndex = -5;
        int newElement = 10;

        // when
        ThrowingRunnable expectedThrown = () -> service.replaceElementByIndex(actual, incorrectIndex, newElement);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testReplaceElementByIndex_whenInputIndexMoreThanCustomArraySize_thenThrowCustomArrayException() {
        // given
        CustomArray actual = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int incorrectIndex = 20;
        int newElement = 10;

        // when
        ThrowingRunnable expectedThrown = () -> service.replaceElementByIndex(actual, incorrectIndex, newElement);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }
}
