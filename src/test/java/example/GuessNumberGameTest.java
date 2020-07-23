package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessNumberGameTest {
    String randomNums = "1234";

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
}
