package example;

import example.util.GenerateUtil;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {
    GenerateUtil generateRandomNum = Mockito.mock(GenerateUtil.class);

    @Test
    public void should_return_4A0B_when_guess_game_given_1234() {
        //given
        given(generateRandomNum.generateAnswer()).willReturn("1234");
        String randomNum = generateRandomNum.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame();
        //when
        String result = guessNumberGame.getGuessResult("1234", randomNum);

        //then
        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_2A2B_when_guess_game_given_1243() {
        //given
        given(generateRandomNum.generateAnswer()).willReturn("1234");
        String randomNum = generateRandomNum.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame();

        //when
        String result = guessNumberGame.getGuessResult("1243", randomNum);

        //then
        assertEquals("2A2B", result);
    }

    @Test
    public void should_return_2A1B_when_guess_game_given_1253() {
        //given
        given(generateRandomNum.generateAnswer()).willReturn("1234");
        String randomNum = generateRandomNum.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame();

        //when
        String result = guessNumberGame.getGuessResult("1253", randomNum);

        //then
        assertEquals("2A1B", result);

    }

    @Test
    public void should_return_0A4B_when_guess_game_given_4321() {
        //given
        given(generateRandomNum.generateAnswer()).willReturn("1234");
        String randomNum = generateRandomNum.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame();

        //when
        String result = guessNumberGame.getGuessResult("4321", randomNum);

        //then
        assertEquals("0A4B", result);

    }

    @Test
    public void should_return_0A2B_when_guess_game_given_5612() {
        //given
        given(generateRandomNum.generateAnswer()).willReturn("1234");
        String randomNum = generateRandomNum.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame();

        //when
        String result = guessNumberGame.getGuessResult("5612", randomNum);

        //then
        assertEquals("0A2B", result);
    }

    @Test
    public void should_return_0A0B_when_guess_game_given_5678() {
        //given
        given(generateRandomNum.generateAnswer()).willReturn("1234");
        String randomNum = generateRandomNum.generateAnswer();
        GuessNumberGame guessNumberGame = new GuessNumberGame();

        //when
        String result = guessNumberGame.getGuessResult("5678", randomNum);

        //then
        assertEquals("0A0B", result);
    }
}
