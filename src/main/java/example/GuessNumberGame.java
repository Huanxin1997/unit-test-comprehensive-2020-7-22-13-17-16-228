package example;

import example.util.GenerateUtil;
import example.util.imp.GenerateUtilImpl;
import example.util.Validator;
import example.util.imp.ValidatorImpl;

import java.util.Scanner;

public class GuessNumberGame {

    private final GenerateUtil generateUtil = new GenerateUtilImpl();
    private final Validator validator = new ValidatorImpl();

    String NOT_VALID = "Wrong Input，Input again";
    String RIGHT_ANSWER = "Congraduations!You are right";

    public String getGuessResult(String guessAnswer, String generateNum) {
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
            if (validator.isValid(guessNum)) {
                System.out.println(this.getGuessResult(guessNum, randomNum));
                if (this.getGuessResult(guessNum, randomNum).equals("4A0B")) {
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
