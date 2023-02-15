package main.java.LeetCode.Miscellaneous.palindrome;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        int sum = 0;

        // Palindrome - reading it from backwards gives the same number

        int temp = x;

        // % gives remainder & / gives quotient

        while(x > 0) { // 121 > 0 || 12 > 0 ||  1 > 0
            int remainder = x % 10;    //  121 % 10 = 1    //   12 % 10 = 2  ||    1 % 10   = 1 ( 10 * 0 = 0 )

            sum = (sum * 10 ) + remainder ;  //  0 * 10 = 0 |  0 + 1 = 1      ||   1 * 10 = 10  |  10 + 2 = 12  ||   12 * 10 = 120 |  120 + 1 = 121

            x = x / 10;  // 121 / 10 = 12   ||  12 / 10 = 1  || 1 / 10 = 0
        }

            if (temp == sum) {
                return true;
            }

        return  false;
    }

}
