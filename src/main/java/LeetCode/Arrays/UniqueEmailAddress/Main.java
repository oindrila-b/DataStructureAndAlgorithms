package main.java.LeetCode.Arrays.UniqueEmailAddress;

public class Main {
    public static void main(String[] args) {
        UniqueEmailAddress uniqueEmailAddress = new UniqueEmailAddress();
        String[] emails = new String[]{
                "test.email+alex@leetcode.com","test.email.leet+alex@code.com"
        };
        System.out.println(uniqueEmailAddress.numUniqueEmails(emails));
    }
}
