package example;

public class GuessNumberGame {
    private String answer;
    private int guessTimes = 0;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guessAnswer) {
        if(!guessAnswer.equals(answer)) {
            return generateOutputResult(guessAnswer, answer);
        }
        return "4A0B";
    }

    String generateOutputResult(String guessAnswer, String answer) {
        GeneratorUtil util = new GeneratorUtil();
        String result = util.generateOutputResult(guessAnswer, answer);
        return result;
    }

    Boolean calculateTimes() {
        guessTimes ++;
        return guessTimes > 6;
    }
}
