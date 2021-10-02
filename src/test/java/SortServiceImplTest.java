import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.service.impl.SortServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class SortServiceImplTest {
    private SortServiceImpl service;

    @Before
    public void setUp() {
        service = new SortServiceImpl();
    }

    @Test
    public void testBubbleSort_happyPath() throws CustomArrayException {
        // given
        CustomArray actual = new CustomArray(3, 5, -4, 10, 19, 7, -1);
        CustomArray expected = new CustomArray(-4, -1, 3, 5, 7, 10, 19);

        // when
        service.bubbleSort(actual);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBubbleSort_whenInputParameterNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.bubbleSort(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testSelectionSort_happyPath() throws CustomArrayException {
        // given
        CustomArray actual = new CustomArray(22, 6, -44, 10, 0, 7, -1);
        CustomArray expected = new CustomArray(-44, -1, 0, 6, 7, 10, 22);

        // when
        service.selectionSort(actual);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSelectionSort_whenInputParameterNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.selectionSort(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testInsertionSort_happyPath() throws CustomArrayException {
        // given
        CustomArray actual = new CustomArray(5, 8, 33, -5, 23, -15, 0);
        CustomArray expected = new CustomArray(-15, -5, 0, 5, 8, 23, 33);

        // when
        service.insertionSort(actual);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInsertionSort_whenInputParameterNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.insertionSort(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testSortUsingStream_happyPath() throws CustomArrayException {
        // given
        CustomArray actual = new CustomArray(3, 5, -4, 10, 19, 7, -1);
        CustomArray expected = new CustomArray(-4, -1, 3, 5, 7, 10, 19);

        // when
        service.sortUsingStream(actual);

        // then
        Assert.assertEquals(expected, actual);
    }
}
