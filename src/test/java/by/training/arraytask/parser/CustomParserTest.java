package by.training.arraytask.parser;

import by.training.arraytask.exception.CustomArrayException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import java.util.ArrayList;
import java.util.List;

public class CustomParserTest {
    private static CustomParser parser;

    @BeforeClass
    public static void setUp() {
        parser = new CustomParser();
    }

    @Test
    public void testParseLines_happyPath() throws CustomArrayException {
        // given
        List<String> inputLines = new ArrayList<>();
        inputLines.add("2 7 9 12 -33 -5");
        inputLines.add("www 3 4 ");
        inputLines.add("5    8 6");
        int[] expected = {2, 7, 9, 12, -33, -5};

        // when
        int[] actual = parser.parseLines(inputLines);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testParseLines_whenInputListIsNull_thenThrowCustomArrayException() {
        // given
        List<String> inputLines = null;

        // when
        ThrowingRunnable expectedThrown = () -> parser.parseLines(inputLines);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @Test
    public void testParseLinesUsingStream_happyPath() throws CustomArrayException {
        // given
        List<String> inputLines = new ArrayList<>();
        inputLines.add("2 7 9 12 -33 -5");
        inputLines.add("www 3 4 ");
        inputLines.add("5    8 6");
        int[] expected = {2, 7, 9, 12, -33, -5};

        // when
        int[] actual = parser.parseLinesUsingStream(inputLines);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testParseLinesUsingStream_whenInputListIsNull_thenThrowCustomArrayException() {
        // given
        List<String> inputLines = null;

        // when
        ThrowingRunnable expectedThrown = () -> parser.parseLinesUsingStream(inputLines);

        // then
        Assert.assertThrows(CustomArrayException.class, expectedThrown);
    }

    @AfterClass
    public static void tearDown() {
        parser = null;
    }
}
