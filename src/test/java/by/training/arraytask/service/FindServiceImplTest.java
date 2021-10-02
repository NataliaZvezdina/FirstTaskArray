import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.service.impl.FindServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class FindServiceImplTest {
    private FindServiceImpl service;

    @Before
    public void setUp() {
        service = new FindServiceImpl();
    }

    @Test
    public void testFindMax_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = 25;

        // when
        int actual = service.findMax(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMax_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.findMax(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testFindMax_whenInputCustomArrayEmpty_thenThrowCustomArrayException() {
        // given
        int[] emptyArray = new int[0];
        CustomArray actual = new CustomArray(emptyArray);

        // when
        ThrowingRunnable expectedThrown = () -> service.findMax(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testFindMin_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = -4;

        // when
        int actual = service.findMin(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMin_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.findMin(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testFindMin_whenInputCustomArrayEmpty_thenThrowCustomArrayException() {
        // given
        int[] emptyArray = new int[0];
        CustomArray actual = new CustomArray(emptyArray);

        // when
        ThrowingRunnable expectedThrown = () -> service.findMin(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testFindMaxUsingStream_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = 25;

        // when
        int actual = service.findMaxUsingStream(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxUsingStream_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.findMaxUsingStream(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testFindMaxUsingStream_whenInputCustomArrayEmpty_thenThrowCustomArrayException() {
        // given
        int[] emptyArray = new int[0];
        CustomArray actual = new CustomArray(emptyArray);

        // when
        ThrowingRunnable expectedThrown = () -> service.findMaxUsingStream(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testFindMinUsingStream_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = -4;

        // when
        int actual = service.findMinUsingStream(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMinUsingStream_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.findMinUsingStream(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testFindMinUsingStream_whenInputCustomArrayEmpty_thenThrowCustomArrayException() {
        // given
        int[] emptyArray = new int[0];
        CustomArray actual = new CustomArray(emptyArray);

        // when
        ThrowingRunnable expectedThrown = () -> service.findMinUsingStream(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }
}
