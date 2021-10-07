package by.training.arraytask.reader;

import by.training.arraytask.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomFileReader {
    private static final Logger logger = LogManager.getLogger();

    public List<String> readLines(String filePath) throws CustomArrayException {
        File file = new File(filePath);

        if (!file.exists() || file.isDirectory()) {
            logger.log(Level.ERROR, "Incorrect filepath");
            throw new CustomArrayException("Incorrect filepath");
        }

        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            logger.log(Level.INFO, "Start reading file: " + filePath);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "Error while reading file: " + filePath);
            throw new CustomArrayException("Error while reading file", e);
        }

        logger.log(Level.INFO, "Finish reading file: " + filePath);
        return lines;
    }

    public List<String> readLinesUsingStream(String filePath) throws CustomArrayException {
        File file = new File(filePath);

        if (!file.exists() || file.isDirectory()) {
            logger.log(Level.ERROR, "Incorrect filepath");
            throw new CustomArrayException("Incorrect filepath");
        }

        logger.log(Level.INFO, "Start reading file: " + filePath);
        List<String> lines = new ArrayList<>();
        try (Stream<String> linesStream = Files.lines(Path.of(filePath))) {
            lines = linesStream.collect(Collectors.toList());
        } catch (IOException e) {
            logger.log(Level.ERROR, "Error while reading file: " + filePath);
            throw new CustomArrayException("Error while reading file", e);
        }

        logger.log(Level.INFO, "Finish reading file: " + filePath);
        return lines;
    }
}
