package example.util.imp;

import example.util.Valid;

import java.util.Arrays;
import java.util.HashSet;

public class ValidImpl implements Valid {
    @Override
    public boolean isValid(String guessNumber) {
        if (guessNumber.length() != 4) {
            return false;
        }
        int[] basicNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < guessNumber.length(); i++) {
            if (Arrays.asList(basicNumber).contains(guessNumber.charAt(i))) {
                return false;
            }
        }
        String[] guessArray = guessNumber.split("");
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(guessArray));
        return hashSet.size() == guessArray.length;
    }
}
