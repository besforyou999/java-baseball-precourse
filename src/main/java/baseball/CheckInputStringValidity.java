package baseball;

public class CheckInputStringValidity {

    public static final String STRING_FORMAT_ERROR ="[ERROR] 숫자를 입력해주세요";
    public static final String STRING_LENGTH_ERROR ="[ERROR] 길이가 3인 숫자를 입력해주세요";

    public static boolean checkString(String input) {
       boolean check=false;
       try{
           check = checkNumeric(input);
       } catch(IllegalArgumentException e) {
           System.out.println(e.getMessage());
           return false;
       }
        try{
            check = checkRange(input);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return check;
    }
    //returns true if str is numeric , returns false if str is not numeric
    public static boolean checkNumeric(String str) {
        if (!str.matches("-?\\d+")) {
            throw new IllegalArgumentException(STRING_FORMAT_ERROR);
        }
        return true;
    }
    // returns true if length is 3 , returns false if length is not 3
    public static boolean checkRange(String str) {
        if (str.length() != 3) {
            throw new IllegalArgumentException(STRING_LENGTH_ERROR);
        }
        return true;
    }
}
