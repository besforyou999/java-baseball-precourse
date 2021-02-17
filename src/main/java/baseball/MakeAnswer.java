package baseball;

import utils.RandomUtils;

public class MakeAnswer {
    public static String makeNewAnswer() {
        String newAnswer = new String();
        for(int i=0; i < 3; i++) {
            int temp = RandomUtils.nextInt(1,9);
            newAnswer += Integer.toString(temp);
        }
        return newAnswer;
    }
}
