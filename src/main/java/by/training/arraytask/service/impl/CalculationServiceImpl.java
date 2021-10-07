package by.training.arraytask.service.impl;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.training.arraytask.service.CalculationService;

import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculationServiceImpl implements CalculationService {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public double calculateAverage(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = calculateTotalSum(customArray);
        double average = ((double) sum) / customArray.size();

        logger.log(Level.INFO, "Calculated average of elements: " + average);
        return average;
    }

    @Override
    public int calculateTotalSum(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        logger.log(Level.INFO, "Calculated total sum of elements: " + sum);
        return sum;
    }

    @Override
    public int countNegativeElements(CustomArray customArray) {
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
    public int countPositiveElements(CustomArray customArray) {
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

    @Override
    public OptionalDouble calculateAverageUsingStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        OptionalDouble average = Arrays.stream(array).average();

        logger.log(Level.INFO, "Calculated average of elements: " + average.getAsDouble());
        return average;
    }

    @Override
    public int calculateTotalSumUsingStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = Arrays.stream(array).sum();

        logger.log(Level.INFO, "Calculated total sum of elements: " + sum);
        return sum;
    }

    @Override
    public int countNegativeElementsUsingStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        long numberOfNegative = Arrays.stream(array).filter(value -> value < 0).count();

        logger.log(Level.INFO, "Number of negative elements: " + numberOfNegative);
        return (int) numberOfNegative;
    }

    @Override
    public int countPositiveElementsUsingStream(CustomArray customArray) {
        int[] array = customArray.getArray();
        long numberOfPositive = Arrays.stream(array).filter(value -> value > 0).count();

        logger.log(Level.INFO, "Number of positive elements: " + numberOfPositive);
        return (int) numberOfPositive;
    }
}
