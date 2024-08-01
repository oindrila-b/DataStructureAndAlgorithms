package main.java.LeetCode.Strings.UniqueEmailAddress;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String reconstructedEmail = "";
            String reconstructedlocalName = email.substring(0,( email.indexOf("@") ));
            if (email.contains("+")) {
                reconstructedlocalName = email.substring(0, email.indexOf('+') ) + email.substring(email.indexOf('@') ,email.indexOf('@') );
            }
            if (email.contains(".")) {
                reconstructedlocalName =  reconstructedlocalName.replace(".", "");
            }
            String reconstructedDomainName = email.substring(email.indexOf('@'));
            reconstructedEmail = reconstructedlocalName + reconstructedDomainName;
            System.out.println(reconstructedEmail);
            uniqueEmails.add(reconstructedEmail);
        }
        return uniqueEmails.size();
    }


}
