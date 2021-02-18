package baseball;

import java.util.Scanner;

public class QuitOrRestart {

    public static final String WRONG_ARGUMENT_ERROR = "1 또는 2 입력";

    // return 0 if error occured , returns 1 or 2 if input is valid
    public static int quitOrRestart(Scanner sc) {
        Question.askReGame();
        Integer a =0;
        do {
            try {
                String input = sc.nextLine();
                a = checkUserInput(input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }while(a==0);
        return a;
    }

    public static int checkUserInput(String input) {
        try {
            return checkValidInteger(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(WRONG_ARGUMENT_ERROR);
        }
    }

    public static int checkValidInteger(String input) {
        int a = Integer.parseInt(input);
        if ( a != 2 && a != 1) {
            throw new IllegalArgumentException(WRONG_ARGUMENT_ERROR);
        }
        return a;
    }
}
