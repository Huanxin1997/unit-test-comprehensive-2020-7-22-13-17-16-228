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

    @Test
    void should_return_true_when_process_given_3_and_4A0B() {
        // given
        ProcessController controller = new ProcessController();
        int times = 3;
        String result = "4A0B";

        // when
        Boolean isContinueGame = controller.controlProcess(times, result);

        // then
        assertEquals(isContinueGame, true);
    }

    @Test
    void should_return_true_when_process_given_3_and_3A1B() {
        // given
        ProcessController controller = new ProcessController();
        int times = 3;
        String result = "3A1B";

        // when
        Boolean isContinueGame = controller.controlProcess(times, result);

        // then
        assertEquals(isContinueGame, true);
    }

    @Test
    void should_return_false_when_process_given_7_and_2A1B() {
        // given
        ProcessController controller = new ProcessController();
        int times = 7;
        String result = "2A1B";

        // when
        Boolean isContinueGame = controller.controlProcess(times, result);

        // then
        assertEquals(isContinueGame, false);
    }

}
