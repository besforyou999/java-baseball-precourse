package baseball;

import java.util.Arrays;

public class MakeHint {

    public static int strikeCheck(String input, String answer) {
        int count = 0;
        char [] inputArr = input.toCharArray();
        char [] answerArr = answer.toCharArray();
        for (int i=0; i < 3; i++) {
            if (inputArr[i] == answerArr[i])
                count++;
        }
        return count;
    }

    public static int ballCheck(String input, String answer, int strikeCount) {
        int count = 0;
        char [] inputArr = input.toCharArray();
        char [] answerArr = answer.toCharArray();
        Arrays.sort(inputArr);
        Arrays.sort(answerArr);
        for (int i=0; i < 3; i++) {
            if (inputArr[i] == answerArr[i])
                count++;
        }
        count = (count-strikeCount);
        return count;
    }
}
