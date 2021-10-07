package by.training.arraytask.parser;

import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.validator.CustomValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomParser {
    private static final Logger logger = LogManager.getLogger();
    private static final String DELIMITER = " ";


    public int[] parseLines(List<String> lines) throws CustomArrayException {
        if (lines == null) {
            logger.log(Level.ERROR, "Cannot parse. Input parameter is null");
            throw new CustomArrayException("Cannot parse. Input parameter is null");
        }

        CustomValidator validator = CustomValidator.getInstance();
        List<Integer> numbers = new ArrayList<>();
        for (String line : lines) {
            if (validator.checkLine(line)) {
                String[] stringNumbers = line.split(DELIMITER);
                for (String stringNumber : stringNumbers) {
                    int number = Integer.parseInt(stringNumber);
                    numbers.add(number);
                }
            }
        }

        int[] resultNumbers = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            resultNumbers[i] = numbers.get(i);
        }

        logger.log(Level.INFO, "Result of parsing: " + Arrays.toString(resultNumbers));
        return resultNumbers;
    }

    public int[] parseLinesUsingStream(List<String> lines) throws CustomArrayException {
        if (lines == null) {
            logger.log(Level.ERROR, "Cannot parse. Input parameter is null");
            throw new CustomArrayException("Cannot parse. Input parameter is null");
        }

        CustomValidator validator = CustomValidator.getInstance();
        int[] resultNumbers = lines.stream()
                .filter(validator::checkLine)
                .flatMap(line -> Arrays.stream(line.split(DELIMITER)))
                .mapToInt(Integer::parseInt)
                .toArray();

        logger.log(Level.INFO, "Result of parsing: " + Arrays.toString(resultNumbers));
        return resultNumbers;
    }
}
