package by.training.arraytask.application;

import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.service.impl.CustomArrayCalculationServiceImpl;
import by.training.arraytask.service.impl.CustomArrayFindServiceImpl;
import by.training.arraytask.service.impl.CustomArrayReplaceServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.training.arraytask.service.CustomArrayCalculationService;
import by.training.arraytask.service.CustomArrayFindService;
import by.training.arraytask.service.CustomArrayReplaceService;

public class ApplicationDemo {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {

        CustomArray customArray = new CustomArray(3, 15, 7, -1, 0, -3, 17, 31, -9);

        try {
            CustomArrayFindService findService = new CustomArrayFindServiceImpl();
            findService.findMax(customArray);
            findService.findMin(customArray);

            CustomArrayCalculationService calculationService = new CustomArrayCalculationServiceImpl();
            calculationService.calculateAverage(customArray);
            calculationService.calculateTotalSum(customArray);
            calculationService.countNegativeElements(customArray);
            calculationService.countPositiveElements(customArray);

            CustomArrayReplaceService replaceService = new CustomArrayReplaceServiceImpl();
            replaceService.replaceElementByIndex(customArray, 2, 12);

        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "by.training.arraytask.Application running was stopped: " + e.getMessage());
        }
    }
}
