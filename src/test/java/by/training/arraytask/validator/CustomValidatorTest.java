package by.training.arraytask.validator;

import org.junit.Assert;
import org.junit.Test;

public class CustomValidatorTest {

    @Test
    public void testCheckLine_whenInputLineCorrect_thenReturnTrue() {
        // given
        String correctLine = "2 3 5 88 4";
        boolean expected = true;

        // when
        boolean actual = CustomValidator.checkLine(correctLine);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckLine_whenInputLineIncorrect_thenReturnFalse() {
        // given
        String incorrectLine = "2 3 5b 88 4  d";
        boolean expected = false;

        // when
        boolean actual = CustomValidator.checkLine(incorrectLine);

        // then
        Assert.assertEquals(expected, actual);
    }
}
