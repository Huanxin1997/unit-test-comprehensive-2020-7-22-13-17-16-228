package example;

import example.util.GenerateUtil;
import example.util.Valid;
import example.util.imp.ValidImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.BDDMockito.given;

public class GenerateNumTest {
    @Test
    void should_return_false_when_generate_num_given_1124() {
        //given
        Valid valid = new ValidImpl();
        GenerateUtil generateRandomNum = Mockito.mock(GenerateUtil.class);
        given(generateRandomNum.generateAnswer()).willReturn("1124");
        //when
        boolean actual = valid.isValid(generateRandomNum.generateAnswer());

        //then
        assertFalse(actual);
    }
}
