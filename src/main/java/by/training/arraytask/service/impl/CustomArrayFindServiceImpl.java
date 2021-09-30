package by.training.arraytask.service.impl;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.training.arraytask.service.CustomArrayFindService;

public class CustomArrayFindServiceImpl implements CustomArrayFindService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMax(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            logger.log(Level.ERROR, "Max element cannot be found. Input parameter is null");
            throw new CustomArrayException("Max element cannot be found. Input parameter is null");
        }

        if (customArray.size() == 0) {
            logger.log(Level.ERROR, "Max element cannot be found. Input parameter is empty");
            throw new CustomArrayException("Max element cannot be found. Input parameter is empty");
        }

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
    public int findMin(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            logger.log(Level.ERROR, "Min element cannot be found. Input parameter is null");
            throw new CustomArrayException("Min element cannot be found. Input parameter is null");
        }

        if (customArray.size() == 0) {
            logger.log(Level.ERROR, "Min element cannot be found. Input parameter is empty");
            throw new CustomArrayException("Min element cannot be found. Input parameter is empty");
        }

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
}
