package baseball;
import java.util.Arrays;
public class CheckInputAndAnswer {
    //return true if input and answer is same, return false if input and answer is not same
    public static boolean checkInputAndAnswer(String input, String answer) {
        int strikeCount = strikeCheck(input,answer);
        int ballCount = ballCheck(input,answer,strikeCount);
        MakeHint.makeHint(strikeCount,ballCount);
        if (strikeCount == 3) {
            return true;
        }
        return false;
    }

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
