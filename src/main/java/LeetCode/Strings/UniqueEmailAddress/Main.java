package main.java.LeetCode.Strings.UniqueEmailAddress;

public class Main {
    public static void main(String[] args) {
        UniqueEmailAddress uniqueEmailAddress = new UniqueEmailAddress();
        int num = uniqueEmailAddress.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});
        int num2 = uniqueEmailAddress.numUniqueEmails(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"});
        int num3 = uniqueEmailAddress.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"});
        System.out.println(num3);
//        System.out.println(num2);
//        System.out.println(num);
    }
}
