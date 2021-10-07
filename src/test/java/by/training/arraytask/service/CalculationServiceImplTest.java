package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.service.impl.CalculationServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class CalculationServiceImplTest {
    private CalculationServiceImpl service = new CalculationServiceImpl();
    private CustomArray testArray = new CustomArray(3, 5, -4, 10, 19, 7, -1, 25, 2, 10);
    private double delta = 0.001;

    @Test
    public void testCalculateAverage() {
        // given
        double expected = 7.6;

        // when
        double actual = service.calculateAverage(testArray);

        // then
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testCalculateTotalSum(){
        // given
        int expected = 76;

        // when
        int actual = service.calculateTotalSum(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeElements() {
        // given
        int expected = 2;

        // when
        int actual = service.countNegativeElements(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountPositiveElements() {
        // given
        int expected = 8;

        // when
        int actual = service.countPositiveElements(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateAverageUsingStream() {
        // given
        OptionalDouble expected = OptionalDouble.of(7.6);

        // when
        OptionalDouble actual = service.calculateAverageUsingStream(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTotalSumUsingStream() {
        // given
        int expected = 76;

        // when
        int actual = service.calculateTotalSumUsingStream(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeElementsUsingStream() {
        // given
        int expected = 2;

        // when
        int actual = service.countNegativeElementsUsingStream(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountPositiveElementsUsingStream() {
        // given
        int expected = 8;

        // when
        int actual = service.countPositiveElementsUsingStream(testArray);

        // then
        Assert.assertEquals(expected, actual);
    }
}
