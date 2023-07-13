package main.java.LeetCode.Strings.AToIString;

public class AToI {
    public int myAtoi(String s) {
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();
        boolean signFlag = false;
    char[] c = s.toCharArray();
        for (char character: c){
            if (character == 32) {
                continue;
            } else if (character == '-') {
                signFlag = true;
            }else if (character >= 48 && character <= 57) {
                stringBuilder.append(character);
            } else {
                continue;
            }
        }
    result  = Integer.parseInt(String.valueOf(stringBuilder));
        if (signFlag) {
            result = result*-1;
            signFlag = false;
        }
    return result;

    }
}
