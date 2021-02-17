package baseball;

import java.util.Arrays;

public class MakeHint {

    public static void makeHint(int strikeCount, int ballCount) {
        if (ballCount != 0) {
            System.out.printf("%d볼 ",ballCount);
        }
        if (strikeCount != 0) {
            System.out.printf("%d스트라이크 ",strikeCount);
        }
    }
}
