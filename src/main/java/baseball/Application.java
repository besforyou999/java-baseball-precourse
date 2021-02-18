package baseball;

import utils.RandomUtils;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {

            GameOperation.gameOperation(scanner);
            Question.askReGame();
            break;
        }
        return ;
    }


}
