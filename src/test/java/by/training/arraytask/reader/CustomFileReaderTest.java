package by.training.arraytask.reader;

import by.training.arraytask.exception.CustomArrayException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import java.util.ArrayList;
import java.util.List;

public class CustomFileReaderTest {
    private static CustomFileReader reader;

    private static final String TEST1_FILE_PATH = "src/test/resources/test1.txt";
    private static final String TEST2_FILE_PATH = "src/test/resources/test2.txt";

    @BeforeClass
    public static void setUp() {
        reader = new CustomFileReader();
    }

    @Test
    public void testReadLines_happyPath() throws CustomArrayException {
        // given
        List<String> expected = new ArrayList<>();
        expected.add("2 345 54 bbb");
        expected.add("gg df 4");
        expected.add("3 4 22 -1");

        // when

        List<String> actual = reader.readLines(TEST1_FILE_PATH);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadLines_whenFilePathIsNull_thenThrowCustomArrayException() {
        // given
        String filePath = null;

        // when
        ThrowingRunnable expectedThrown = () -> reader.readLines(filePath);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testReadLines_whenFileNotExist_thenThrowCustomArrayException() {
        // given
        String filePath = "notExistingFilePath";

        // when
        ThrowingRunnable expectedThrown = () -> reader.readLines(filePath);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testReadLinesUsingStream_happyPath() throws CustomArrayException {
        // given
        List<String> expected = new ArrayList<>();
        expected.add("66 7 5  6j");
        expected.add("-e 13 0");
        expected.add("5 15");

        // when

        List<String> actual = reader.readLinesUsingStream(TEST2_FILE_PATH);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReadLinesUsingStream_whenFilePathIsNull_thenThrowCustomArrayException() {
        // given
        String filePath = null;

        // when
        ThrowingRunnable expectedThrown = () -> reader.readLinesUsingStream(filePath);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testReadLinesUsingStream_whenFileNotExist_thenThrowCustomArrayException() {
        // given
        String filePath = "notExistingFilePath";

        // when
        ThrowingRunnable expectedThrown = () -> reader.readLinesUsingStream(filePath);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @AfterClass
    public static void tearDown() {
        reader = null;
    }
}
