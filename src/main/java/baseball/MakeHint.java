package baseball;

import java.util.Arrays;

public class MakeHint {

    public static void makeHint(int strikeCount, int ballCount) {
        if (ballCount != 0) {
            System.out.printf("%d볼\n",ballCount);
        }
        if (strikeCount != 0) {
            System.out.printf("%d스트라이크\n",strikeCount);
        }
        if ( strikeCount == 0 && ballCount == 0) {
            System.out.println("낫싱");
        }

    }
}
