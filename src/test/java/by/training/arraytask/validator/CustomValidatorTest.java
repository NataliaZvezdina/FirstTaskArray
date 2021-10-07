package by.training.arraytask.validator;

import org.junit.Assert;
import org.junit.Test;

public class CustomValidatorTest {
    private CustomValidator validator = CustomValidator.getInstance();

    @Test
    public void testCheckLineWhenCorrect() {
        // given
        String correctLine = "2 3 5  88 4";
        boolean expected = true;

        // when
        boolean actual = validator.checkLine(correctLine);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckLineWhenIncorrect() {
        // given
        String incorrectLine = "2   3 5b 88 4  d";
        boolean expected = false;

        // when
        boolean actual = validator.checkLine(incorrectLine);

        // then
        Assert.assertEquals(expected, actual);
    }
}
