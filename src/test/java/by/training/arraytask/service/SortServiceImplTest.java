package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.service.impl.SortServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class SortServiceImplTest {
    private SortServiceImpl service = new SortServiceImpl();
    private CustomArray actual = new CustomArray(3, 5, -4, 10, 19, 7, -1);
    private CustomArray expected = new CustomArray(-4, -1, 3, 5, 7, 10, 19);

    @Test
    public void testBubbleSort(){
        // when
        service.bubbleSort(actual);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSelectionSort() {
        // when
        service.selectionSort(actual);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testInsertionSort() {
        // when
        service.insertionSort(actual);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSortUsingStream() {
        // when
        service.sortUsingStream(actual);

        // then
        Assert.assertEquals(expected, actual);
    }
}
