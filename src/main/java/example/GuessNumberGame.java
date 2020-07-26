package example;

public class GuessNumberGame {
    private final String answer;

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
        return util.generateOutputResult(guessAnswer, answer);
    }

}
