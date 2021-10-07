package by.training.arraytask.service.impl;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.service.SortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SortServiceImpl implements SortService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void bubbleSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        customArray.setArray(array);
        logger.log(Level.INFO, "Bubble sorting done: " + customArray);
    }

    @Override
    public void selectionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = min;
                array[min_i] = tmp;
            }
        }

        customArray.setArray(array);
        logger.log(Level.INFO, "Selection sorting done: " + customArray);
    }

    @Override
    public void insertionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        int key;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        customArray.setArray(array);
        logger.log(Level.INFO, "Insertion sorting done: " + customArray);
    }

    @Override
    public void sortUsingStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        int[] sortedArray = Arrays.stream(array).sorted().toArray();

        customArray.setArray(sortedArray);
        logger.log(Level.INFO, "Sorting using stream done: " + customArray);
    }
}
