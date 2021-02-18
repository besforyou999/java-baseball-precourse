package baseball;

import utils.RandomUtils;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (true) {
            GameOperation.gameOperation(scanner);
            try {
                a = QuitOrRestart.quitOrRestart(scanner);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                a = QuitOrRestart.quitOrRestart(scanner);
            }
            if (a==2) break;
        }
        return ;
    }
}
