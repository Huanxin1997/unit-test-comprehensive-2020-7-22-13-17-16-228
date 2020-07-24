package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberProcessTest {

    @Test
    void should_return_false_when_process_given_9_and_4A0B() {
        // given
        ProcessController controller = new ProcessController();
        int times = 9;
        String result = "4A0B";

        // when
        Boolean isContinueGame = controller.controlProcess(times, result);

        // then
        assertEquals(isContinueGame, false);
    }

}
