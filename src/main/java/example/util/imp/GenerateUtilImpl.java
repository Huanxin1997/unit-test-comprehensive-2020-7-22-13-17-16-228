package example.util.imp;

import example.util.GenerateUtil;

import java.util.Arrays;

public class GenerateUtilImpl implements GenerateUtil {
    @Override
    public String generateAnswer() {
        int length = 4;
        int maxNum = 9;
        int minNum = 0;
        Integer[] result = new Integer[length];
        Arrays.fill(result, 0);
        StringBuilder answer = new StringBuilder();

        int count = 0;
        while(count < length) {
            int num = (int) (Math.random() * (maxNum - minNum)) + minNum;
            boolean flag = true;
            for (int j = 0; j < length; j++) {
                if(num == result[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result[count] = num;
                count++;
            }
        }
        for (Integer integer : result) {
            answer.append(integer);
        }
        return answer.toString();
    }
}
