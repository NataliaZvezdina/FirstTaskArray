package by.training.arraytask.service.impl;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.training.arraytask.service.CustomArrayCalculationService;

public class CustomArrayCalculationServiceImpl implements CustomArrayCalculationService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public double calculateAverage(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            logger.log(Level.ERROR, "Average cannot be calculated. Input parameter is null");
            throw new CustomArrayException("Average cannot be calculated. Input parameter is null");
        }

        if (customArray.size() == 0) {
            logger.log(Level.ERROR, "Average cannot be calculated. Input parameter is empty");
            throw new CustomArrayException("Average cannot be calculated. Input parameter is empty");
        }

        int[] array = customArray.getArray();
        int sum = calculateTotalSum(customArray);
        double average = (double) (sum / customArray.size());

        logger.log(Level.INFO, "Calculated average of elements: " + average);
        return average;
    }

    @Override
    public int calculateTotalSum(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            logger.log(Level.ERROR, "Sum cannot be calculated. Input parameter is null");
            throw new CustomArrayException("Sum cannot be calculated. Input parameter is null");
        }

        if (customArray.size() == 0) {
            logger.log(Level.INFO, "Calculated total sum of elements: " + 0 + " as CustomArray is empty");
            return 0;
        }

        int[] array = customArray.getArray();
        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        logger.log(Level.INFO, "Calculated total sum of elements: " + sum);
        return sum;
    }

    @Override
    public int countNegativeElements(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            logger.log(Level.ERROR, "Calculation cannot be done. Input parameter is null");
            throw new CustomArrayException("Calculation cannot be done. Input parameter is null");
        }

        if (customArray.size() == 0) {
            logger.log(Level.INFO, "Number of negative elements: " + 0 + " as CustomArray is empty");
            return 0;
        }

        int[] array = customArray.getArray();

        int numberOfNegative = 0;
        for (int element : array) {
            if (element < 0) {
                numberOfNegative++;
            }
        }

        logger.log(Level.INFO, "Number of negative elements: " + numberOfNegative);
        return numberOfNegative;
    }

    @Override
    public int countPositiveElements(CustomArray customArray) throws CustomArrayException {
        if (customArray == null) {
            logger.log(Level.ERROR, "Calculation cannot be done. Input parameter is null");
            throw new CustomArrayException("Calculation cannot be done. Input parameter is null");
        }

        if (customArray.size() == 0) {
            logger.log(Level.INFO, "Number of positive elements: " + 0 + " as CustomArray is empty");
            return 0;
        }

        int[] array = customArray.getArray();

        int numberOfPositive = 0;
        for (int element : array) {
            if (element > 0) {
                numberOfPositive++;
            }
        }

        logger.log(Level.INFO, "Number of positive elements: " + numberOfPositive);
        return numberOfPositive;
    }
}
