package baseball;

import java.util.Scanner;

public class GameOperation {
    public static void gameOperation(Scanner sc) {
        String answer = MakeAnswer.makeNewAnswer();
        System.out.println(answer);
        while (true) {
            Question.askForInput();
            String input = sc.nextLine();
            if (CheckInputStringValidity.checkString(input) == false) continue;
            if ( CheckInputAndAnswer.checkInputAndAnswer(input,answer) ) { // if true -> 3 strike
                return ;
            }
        }
    }
}
