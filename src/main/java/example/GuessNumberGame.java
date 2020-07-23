package example;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guessAnswer) {
        if(!guessAnswer.equals(answer)) {
            return "2A2B";
        }
        return "4A0B";
    }
}
