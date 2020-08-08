package example;

import example.util.GenerateUtil;
import example.util.Validator;
import example.util.imp.ValidatorImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class GenerateTest {
    GenerateUtil generateRandomNum = Mockito.mock(GenerateUtil.class);

    @Test
    void should_return_false_when_generate_num_given_1124() {
        //given
        Validator validator = new ValidatorImpl();
        when(generateRandomNum.generateAnswer()).thenReturn("1124");

        //when
        boolean actual = validator.isValid(generateRandomNum.generateAnswer());

        //then
        assertFalse(actual);
    }

    @Test
    void should_return_true_when_generate_num_given_1324() {
        //given
        Validator validator = new ValidatorImpl();
        when(generateRandomNum.generateAnswer()).thenReturn("1324");

        //when
        boolean result = validator.isValid(generateRandomNum.generateAnswer());

        //then
        assertTrue(result);
    }
}
