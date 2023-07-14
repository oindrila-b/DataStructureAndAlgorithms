package main.java.LeetCode.Arrays.IsSequence;

public class Main {
    public static void main(String[] args) {
        IsSequence isSequence = new IsSequence();
        System.out.println(isSequence.isSubsequence( "abc","ahbgdc"));
        System.out.println(isSequence.isSubsequence( "axc","ahbgdc"));
        System.out.println(isSequence.isSubsequence( "aec","chagdc"));
        System.out.println(isSequence.isSubsequence( "dabe","bhagde"));
    }
}
