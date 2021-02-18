package baseball;

public class CheckInputAndAnswer {
    //return true if input and answer is same, return false if input and answer is not same
    public static boolean checkInputAndAnswer(String input, String answer) {
        int strikeCount = strikeCheck(input,answer);
        int ballCount = ballCheck(input,answer);
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

    public static int ballCheck(String input, String answer) {
        int count = 0;
        char [] inputArr = input.toCharArray();
        char [] answerArr = answer.toCharArray();
        for (int i=0; i < 3; i++) {
            char checkChar = inputArr[i];
            count += checkExistenceOfChar(checkChar,answerArr,inputArr,i);
        }
        return count;
    }

    public static int checkExistenceOfChar(char checkChar, char [] answerArr, char [] inputArr, int index) {
        int exist = 0;
        for(int i=0; i < 3; i++) {
            if (checkChar == answerArr[i] && i != index && inputArr[i] != checkChar) exist = 1;
        }
        return exist;
    }

}
