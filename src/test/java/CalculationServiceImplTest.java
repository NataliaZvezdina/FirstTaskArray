import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.service.impl.CalculationServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class CalculationServiceImplTest {
    private CalculationServiceImpl service;

    @Before
    public void setUp() {
        service = new CalculationServiceImpl();
    }

    @Test
    public void testCalculateAverage_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        double expected = 7.6;
        double delta = 0.001;

        // when
        double actual = service.calculateAverage(input);

        // then
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateAverage_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.calculateAverage(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testCalculateAverage_whenInputCustomArrayEmpty_thenThrowCustomArrayException() {
        // given
        int[] emptyArray = new int[0];
        CustomArray actual = new CustomArray(emptyArray);

        // when
        ThrowingRunnable expectedThrown = () -> service.calculateAverage(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testCalculateTotalSum_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = 76;

        // when
        int actual = service.calculateTotalSum(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotalSum_whenInputCustomArrayEmpty() throws CustomArrayException {
        // given
        int[] emptyArray = new int[0];
        CustomArray input = new CustomArray(emptyArray);
        int expected = 0;

        // when
        int actual = service.calculateTotalSum(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotalSum_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.calculateTotalSum(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testCountNegativeElements_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = 2;

        // when
        int actual = service.countNegativeElements(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeElements_whenInputCustomArrayEmpty() throws CustomArrayException {
        // given
        int[] emptyArray = new int[0];
        CustomArray input = new CustomArray(emptyArray);
        int expected = 0;

        // when
        int actual = service.countNegativeElements(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeElements_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.countNegativeElements(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testCountPositiveElements_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = 8;

        // when
        int actual = service.countPositiveElements(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountPositiveElements_whenInputCustomArrayEmpty() throws CustomArrayException {
        // given
        int[] emptyArray = new int[0];
        CustomArray input = new CustomArray(emptyArray);
        int expected = 0;

        // when
        int actual = service.countPositiveElements(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountPositiveElements_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.countPositiveElements(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testCalculateAverageUsingStream_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        double expected = 7.6;
        double delta = 0.001;

        // when
        double actual = service.calculateAverageUsingStream(input);

        // then
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateAverageUsingStream_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.calculateAverageUsingStream(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testCalculateAverageUsingStream_whenInputCustomArrayEmpty_thenThrowCustomArrayException() {
        // given
        int[] emptyArray = new int[0];
        CustomArray actual = new CustomArray(emptyArray);

        // when
        ThrowingRunnable expectedThrown = () -> service.calculateAverageUsingStream(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testCalculateTotalSumUsingStream_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = 76;

        // when
        int actual = service.calculateTotalSumUsingStream(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotalSumUsingStream_whenInputCustomArrayEmpty() throws CustomArrayException {
        // given
        int[] emptyArray = new int[0];
        CustomArray input = new CustomArray(emptyArray);
        int expected = 0;

        // when
        int actual = service.calculateTotalSumUsingStream(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotalSumUsingStream_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.calculateTotalSumUsingStream(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testCountNegativeElementsUsingStream_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = 2;

        // when
        int actual = service.countNegativeElementsUsingStream(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeElementsUsingStream_whenInputCustomArrayEmpty() throws CustomArrayException {
        // given
        int[] emptyArray = new int[0];
        CustomArray input = new CustomArray(emptyArray);
        int expected = 0;

        // when
        int actual = service.countNegativeElementsUsingStream(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeElementsUsingStream_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.countNegativeElementsUsingStream(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testCountPositiveElementsUsingStream_happyPath() throws CustomArrayException {
        // given
        CustomArray input = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
        int expected = 8;

        // when
        int actual = service.countPositiveElementsUsingStream(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountPositiveElementsUsingStream_whenInputCustomArrayEmpty() throws CustomArrayException {
        // given
        int[] emptyArray = new int[0];
        CustomArray input = new CustomArray(emptyArray);
        int expected = 0;

        // when
        int actual = service.countPositiveElementsUsingStream(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountPositiveElementsUsingStream_whenInputCustomArrayNull_thenThrowCustomArrayException() {
        // given
        CustomArray actual = null;

        // when
        ThrowingRunnable expectedThrown = () -> service.countPositiveElementsUsingStream(actual);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

}
