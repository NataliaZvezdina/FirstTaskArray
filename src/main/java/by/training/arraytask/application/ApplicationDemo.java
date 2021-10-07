package by.training.arraytask.application;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.parser.CustomParser;
import by.training.arraytask.reader.CustomFileReader;
import by.training.arraytask.service.impl.CalculationServiceImpl;
import by.training.arraytask.service.impl.SortServiceImpl;

import java.util.List;

public class ApplicationDemo {
    private static final String FILE_PATH = "src/main/resources/data/example.txt";

    public static void main(String[] args) throws CustomArrayException {

        CustomFileReader reader = new CustomFileReader();
        List<String> lines = reader.readLinesUsingStream(FILE_PATH);

        CustomParser parser = new CustomParser();
        int[] ints = parser.parseLinesUsingStream(lines);

        CustomArray customArray = new CustomArray(ints);

        System.out.println(customArray);

        CalculationServiceImpl calculationService = new CalculationServiceImpl();
        int numberOfPositive = calculationService.countPositiveElementsUsingStream(customArray);
        int numberOfNegative = calculationService.countNegativeElementsUsingStream(customArray);
        double avg = calculationService.calculateAverageUsingStream(customArray).getAsDouble();
        int sum = calculationService.calculateTotalSumUsingStream(customArray);
        System.out.println(numberOfPositive);
        System.out.println(numberOfNegative);
        System.out.println(avg);
        System.out.println(sum);

        SortServiceImpl sortService = new SortServiceImpl();
        sortService.sortUsingStream(customArray);
        System.out.println("After sorting: " + customArray);
    }
}
