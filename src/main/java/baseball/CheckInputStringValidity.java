package baseball;

public class CheckInputStringValidity {

    public static boolean checkString(String input) {
        if (checkNumeric(input) == false) {
            System.out.println("[ERROR] 숫자를 입력해주세요");
            return false;
        }
        if (checkRange(input) == false) {
            System.out.println("[ERROR] 길이가 3인 숫자를 입력해주세요");
            return false;
        }
        return true;
    }
    //returns true if str is numeric , returns false if str is not numeric
    public static boolean checkNumeric(String str) {
        if (str.matches("-?\\d+")) {
            return true;
        }
        return false;
    }
    // returns true if length is 3 , returns false if length is not 3
    public static boolean checkRange(String str) {
        if (str.length() != 3) {
            return false;
        }
        return true;
    }

}
