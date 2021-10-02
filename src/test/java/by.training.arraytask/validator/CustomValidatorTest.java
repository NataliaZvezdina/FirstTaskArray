import by.training.arraytask.entity.CustomArray;
import by.training.arraytask.validator.CustomValidator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomValidatorTest {
    private CustomValidator validator;

    @Before
    public void setUp() throws Exception {
        validator = new CustomValidator();
    }

    @Test
    public void testCheckLine_whenInputLineCorrect_thenReturnTrue() {
        // given
        String correctLine = "2 3 5 88 4";
        boolean expected = true;

        // when
        boolean actual = validator.checkLine(correctLine);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckLine_whenInputLineIncorrect_thenReturnFalse() {
        // given
        String incorrectLine = "2 3 5b 88 4  d";
        boolean expected = false;

        // when
        boolean actual = validator.checkLine(incorrectLine);

        // then
        Assert.assertEquals(expected, actual);
    }
}
