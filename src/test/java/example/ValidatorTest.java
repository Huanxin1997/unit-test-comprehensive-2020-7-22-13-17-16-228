package example;

import example.util.Validator;
import example.util.imp.ValidatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    void should_false_when_isValid_given_abc() {
        //given
        Validator validator = new ValidatorImpl();

        //when
        boolean result = validator.isValid("abc");

        //then
        assertFalse(result);

    }

    @Test
    void should_false_when_isValid_given_8646() {
        //given
        Validator validator = new ValidatorImpl();

        //when
        boolean result = validator.isValid("8646");

        //then
        assertFalse(result);
    }

    @Test
    void should_false_when_isValid_given_8() {
        //given
        Validator validator = new ValidatorImpl();

        //when
        boolean result = validator.isValid("8");

        //then
        assertFalse(result);
    }

    @Test
    void should_false_when_isValid_given_85() {
        //given
        Validator validator = new ValidatorImpl();

        //when
        boolean result = validator.isValid("85");

        //then
        assertFalse(result);
    }

    @Test
    void should_false_when_isValid_given_247() {
        //given
        Validator validator = new ValidatorImpl();

        //when
        boolean result = validator.isValid("247");

        //then
        assertFalse(result);
    }

    @Test
    void should_true_when_isValid_given_7896() {
        //given
        Validator validator = new ValidatorImpl();

        //when
        boolean result = validator.isValid("7896");

        //then
        assertTrue(result);
    }
}
