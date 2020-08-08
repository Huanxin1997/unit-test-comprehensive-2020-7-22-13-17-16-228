package example;

import example.util.Valid;
import example.util.imp.ValidImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidTest {

    @Test
    void should_false_when_isValid_given_abc() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValid("abc");

        //then
        assertFalse(result);

    }

    @Test
    void should_false_when_isValid_given_8646() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValid("8646");

        //then
        assertFalse(result);
    }

    @Test
    void should_false_when_isValid_given_8() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValid("8");

        //then
        assertFalse(result);
    }

    @Test
    void should_false_when_isValid_given_85() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValid("85");

        //then
        assertFalse(result);
    }

    @Test
    void should_false_when_isValid_given_247() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValid("247");

        //then
        assertFalse(result);
    }

    @Test
    void should_true_when_isValid_given_7896() {
        //given
        Valid valid = new ValidImpl();

        //when
        boolean result = valid.isValid("7896");

        //then
        assertTrue(result);
    }
}
