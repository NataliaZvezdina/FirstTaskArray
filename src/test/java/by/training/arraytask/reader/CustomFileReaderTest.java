import by.training.arraytask.exception.CustomArrayException;
import by.training.arraytask.reader.CustomFileReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomFileReaderTest {
    private CustomFileReader reader;
    private static final String TEST1_FILE_PATH = "src/test/resources/test1.txt";
    private static final String TEST2_FILE_PATH = "src/test/resources/test2.txt";

    @Before
    public void setUp() {
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
}
