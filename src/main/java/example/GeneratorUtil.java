package example;

public class GeneratorUtil {
    public String generateRandomNumbers() {
        int number = (int)(Math.random()*9+1)*1000;
        return String.valueOf(number);
    }

    String generateOutputResult(String guessAnswer, String answer) {
        Valid valid = new Valid();
        int[] resultNums = valid.validAnswer(guessAnswer, answer);
        return String.format("%sA%sB", resultNums[0], resultNums[1]);
    }
}
