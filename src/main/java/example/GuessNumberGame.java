package example;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guessAnswer) {
        if(!guessAnswer.equals(answer)) {
            return generateOutputResult(guessAnswer);
        }
        return "4A0B";
    }

    public int[] validAnswer(String guessAnswer) {
        System.out.println(guessAnswer);
        System.out.println(this.answer);
        int errorPositionCount = 0;
        int rightPositionCount = 0;
        for(int i = 0;i < guessAnswer.length();i ++) {
            if(guessAnswer.charAt(i) == answer.charAt(i)) {
                rightPositionCount ++;
            }else{
                if(this.answer.contains(String.valueOf(guessAnswer.charAt(i)))) {
                    errorPositionCount ++;
                }
            }
        }
        int[] result = new int[]{rightPositionCount, errorPositionCount};
        return result;
    }

    String generateOutputResult(String guessAnswer) {
        int[] resultNums = validAnswer(guessAnswer);
        return String.format("%sA%sB", resultNums[0], resultNums[1]);
    }
}
