package example;

public class GeneratorUtil {
    public String generateRandomNumbers() {
        return null;
    }

    String generateOutputResult(String guessAnswer, String answer) {
        Valid valid = new Valid();
        int[] resultNums = valid.validAnswer(guessAnswer, answer);
        return String.format("%sA%sB", resultNums[0], resultNums[1]);
    }
}
