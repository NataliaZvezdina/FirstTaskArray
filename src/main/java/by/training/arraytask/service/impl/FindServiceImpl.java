package by.training.arraytask.service.impl;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.training.arraytask.service.FindService;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindServiceImpl implements FindService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMax(CustomArray customArray) {
        int[] array = customArray.getArray();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        logger.log(Level.INFO, "Found max element: " + max);
        return max;
    }

    @Override
    public int findMin(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        logger.log(Level.INFO, "Found min element: " + min);
        return min;
    }

    @Override
    public OptionalInt findMaxUsingStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        OptionalInt max = Arrays.stream(array).max();

        logger.log(Level.INFO, "Found max element: " + max);
        return max;
    }

    @Override
    public OptionalInt findMinUsingStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        OptionalInt min = Arrays.stream(array).min();

        logger.log(Level.INFO, "Found min element: " + min);
        return min;
    }
}
