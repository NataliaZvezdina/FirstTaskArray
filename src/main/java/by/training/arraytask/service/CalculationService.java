package by.training.arraytask.service;

import by.training.arraytask.entity.CustomArray;
import java.util.OptionalDouble;

public interface CalculationService {

    double calculateAverage(CustomArray customArray);

    int calculateTotalSum(CustomArray customArray);

    int countNegativeElements(CustomArray customArray);

    int countPositiveElements(CustomArray customArray);

    OptionalDouble calculateAverageUsingStream(CustomArray customArray);

    int calculateTotalSumUsingStream(CustomArray customArray);

    int countNegativeElementsUsingStream(CustomArray customArray);

    int countPositiveElementsUsingStream(CustomArray customArray);
}
