package baseball;

public class CheckIFInputisNumeric {

    public static boolean checkString(String input) {
        if (checkNumeric(input) == false) {
            return false;
        }
        if (checkRange(input) == false) {
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
