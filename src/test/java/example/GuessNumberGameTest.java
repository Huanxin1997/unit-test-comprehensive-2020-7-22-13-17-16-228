package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessNumberGameTest {
    String randomNums = "1234";
//    GeneratorUtil generatorUtil = new Mock(GeneratorUtil.class);

    @Test
    public void should_return_4A0B_when_guess_1234_given_1234() {
        //given
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomNums);

        //when
        String actual = guessNumberGame.guess(answer);

        //then
        Assertions.assertEquals("4A0B", actual);
    }

    @Test
    public void should_return_2A2B_when_guess_1243_given_1234() {
        //given
        String answer = "1243";
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomNums);

        //when
        String actual = guessNumberGame.guess(answer);

        //then
        Assertions.assertEquals("2A2B", actual);
    }

    @Test
    public void should_return_1A2B_when_guess_1024_given_1234() {
        //given
        String answer = "1024";
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomNums);

        //when
        String actual = guessNumberGame.guess(answer);

        //then
        Assertions.assertEquals("2A1B", actual);
    }

    @Test
    public void should_return_0A4B_when_guess_4321_given_1234() {
        //given
        String answer = "4321";
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomNums);

        //when
        String actual = guessNumberGame.guess(answer);

        //then
        Assertions.assertEquals("0A4B", actual);
    }

    @Test
    public void should_return_0A2B_when_guess_2189_given_1234() {
        //given
        String answer = "2189";
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomNums);

        //when
        String actual = guessNumberGame.guess(answer);

        //then
        Assertions.assertEquals("0A2B", actual);
    }

    @Test
    public void should_return_0A0B_when_guess_6789_given_1234() {
        //given
        String answer = "6789";
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomNums);

        //when
        String actual = guessNumberGame.guess(answer);

        //then
        Assertions.assertEquals("0A0B", actual);
    }

    @Test
    public void should_return_wrong_when_guess_more_than_6_times() {
        //given
        String answer = "6789";
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomNums);

        //when
        String actual = guessNumberGame.guess(answer);

        //then
        Assertions.assertEquals("Wrong Input，Input again", actual);
    }
}
