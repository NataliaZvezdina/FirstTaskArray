package by.training.arraytask.application;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.parser.CustomParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationDemo {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) throws CustomArrayException {

        CustomArray customArray = new CustomArray(3, 15, 7, -1, 0, -3, 17, 31, -9);

//        try {
//            CustomArrayFindService findService = new CustomArrayFindServiceImpl();
//            findService.findMax(customArray);
//            findService.findMin(customArray);
//
//            CustomArrayCalculationService calculationService = new CustomArrayCalculationServiceImpl();
//            calculationService.calculateAverage(customArray);
//            calculationService.calculateTotalSum(customArray);
//            calculationService.countNegativeElements(customArray);
//            calculationService.countPositiveElements(customArray);
//
//            CustomArrayReplaceService replaceService = new CustomArrayReplaceServiceImpl();
//            replaceService.replaceElementByIndex(customArray, 2, 12);

            //String line = "2 33 0";
            //String[] strings = line.split("^-?\\d+(\\s(-?\\d+))*$");
            //System.out.println(line.matches("^-?\\d+(\\s(-?\\d+))*$"));

//        } catch (CustomArrayException e) {
//            logger.log(Level.ERROR, "by.training.arraytask.Application running was stopped: " + e.getMessage());
//        }
        List<String> lines = new ArrayList<>();
        lines.add("2 3 5 6 7");
        lines.add("c3 4 5");
        lines.add("1 1 1 1");
        lines.add("0 k 0");
        CustomParser parser = new CustomParser();
        int[] ints = parser.parseLines(lines);
        System.out.println(Arrays.toString(ints));

    }
}
