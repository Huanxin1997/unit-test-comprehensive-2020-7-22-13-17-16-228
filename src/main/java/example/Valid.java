package example;

public class Valid {
    public int[] validAnswer(String guessAnswer, String answer) {
        int errorPositionCount = 0;
        int rightPositionCount = 0;
        for(int i = 0;i < guessAnswer.length();i ++) {
            if(guessAnswer.charAt(i) == answer.charAt(i)) {
                rightPositionCount ++;
            }else{
                if(answer.contains(String.valueOf(guessAnswer.charAt(i)))) {
                    errorPositionCount ++;
                }
            }
        }
        return new int[]{rightPositionCount, errorPositionCount};
    }
}
