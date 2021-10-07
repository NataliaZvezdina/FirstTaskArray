package by.training.arraytask.service.impl;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.training.arraytask.service.ReplaceService;

import java.util.Arrays;

public class ReplaceServiceImpl implements ReplaceService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public void replaceElementByIndex(CustomArray customArray, int index, int newElement) throws CustomArrayException {
        if (index < 0 || index > (customArray.size() - 1)) {
            logger.log(Level.ERROR, "Invalid value for index");
            throw new CustomArrayException("Invalid value for index");
        }

        int[] array = customArray.getArray();
        array[index] = newElement;
        customArray.setArray(array);
        logger.log(Level.INFO, "Element by index: " + index + " was replaced on: " + newElement);
    }

}
