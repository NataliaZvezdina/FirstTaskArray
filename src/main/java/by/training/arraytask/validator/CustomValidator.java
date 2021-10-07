package by.training.arraytask.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomValidator {
    private static final Logger logger = LogManager.getLogger();

    private static CustomValidator instance = new CustomValidator();
    private static final String LINE_PATTERN = "^-?\\d+(\\s(-?\\d+))*$";

    private CustomValidator() {}

    public static CustomValidator getInstance() {
        return instance;
    }

    public boolean checkLine(String line) {
        logger.log(Level.INFO, "Checking string line: " + line + " on validity");
        return line.matches(LINE_PATTERN);
    }
}
