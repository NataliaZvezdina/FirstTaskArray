package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;

public interface CalculationService {

    double calculateAverage(CustomArray customArray) throws CustomArrayException;

    int calculateTotalSum(CustomArray customArray) throws CustomArrayException;

    int countNegativeElements(CustomArray customArray) throws CustomArrayException;

    int countPositiveElements(CustomArray customArray) throws CustomArrayException;

    double calculateAverageUsingStream(CustomArray customArray) throws CustomArrayException;

    int calculateTotalSumUsingStream(CustomArray customArray) throws CustomArrayException;

    int countNegativeElementsUsingStream(CustomArray customArray) throws CustomArrayException;

    int countPositiveElementsUsingStream(CustomArray customArray) throws CustomArrayException;
}
