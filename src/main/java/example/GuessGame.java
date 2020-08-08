package example;

import example.util.GenerateUtil;
import example.util.imp.GenerateUtilImpl;
import example.util.Valid;
import example.util.imp.ValidImpl;

import java.util.Scanner;

public class GuessGame {

    private final GenerateUtil generateUtil = new GenerateUtilImpl();
    private final Valid valid = new ValidImpl();

    String NOT_VALID = "Wrong Input，Input again";
    String RIGHT_ANSWER = "Congraduations!You are right";

    public String guess(String guessAnswer, String generateNum) {
        int errorPositionCount = 0;
        int rightPositionCount = 0;
        for (int i = 0; i < guessAnswer.length(); i++) {
            if (guessAnswer.charAt(i) == generateNum.charAt(i)) {
                rightPositionCount++;
            } else {
                if (generateNum.contains(String.valueOf(guessAnswer.charAt(i)))) {
                    errorPositionCount++;
                }
            }
        }
        return rightPositionCount + "A" + errorPositionCount + "B";
    }

    public void startGame() {
        System.out.println("==============Welcome come to Guess Number==============");
        String randomNum = generateUtil.generateAnswer();
        System.out.println("===========The Random Number has been generate==========");
        Scanner sc = new Scanner(System.in);
        int remainingTimes = 6;
        while (remainingTimes > 0) {
            String guessNum = sc.nextLine();
            if (valid.isValid(guessNum)) {
                System.out.println(this.guess(guessNum, randomNum));
                if (this.guess(guessNum, randomNum).equals("4A0B")) {
                    System.out.println(RIGHT_ANSWER);
                    sc.close();
                }
            } else {
                System.out.println(NOT_VALID);
            }
            remainingTimes--;
            if (remainingTimes == 0) {
                System.out.println("The answer is: " + randomNum);
            }
        }
        sc.close();
    }
}
