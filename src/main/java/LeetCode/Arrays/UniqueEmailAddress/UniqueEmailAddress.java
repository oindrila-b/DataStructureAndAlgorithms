package main.java.LeetCode.Arrays.UniqueEmailAddress;

import java.util.ArrayList;
import java.util.List;

public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {

        List<String> uniqueEmailArray= new ArrayList<>();

        String[] emailArray = emails;

        for (String email :emailArray) {
            String[] emailSeparator = email.split("@");
            String localName = emailSeparator[0];
            System.out.println("Local Name : " + localName);
            String domainName = emailSeparator[1];
            System.out.println("Domain : " + domainName);
            StringBuilder localname = null;

            if (localName.contains("+")){
                System.out.println("Does have +" );
                localName = localName.substring(0, localName.indexOf("+"));
                System.out.println("Reformatted localName = " + localName);
            }
            System.out.println("Doesn't have  + ");
            if (localName.contains(".")){
                 localname = new StringBuilder();
                String [] splitNames = localName.split("\\.");
                for (var s: splitNames) {
                    localname.append(s);
                }
            } else {
                localname = new StringBuilder(localName);
            }
            System.out.println("Reformatted localName = " + localname);
            String uniqueEmail = localname+"@"+domainName;
            System.out.println(uniqueEmail);
            if (!uniqueEmailArray.contains(uniqueEmail)) {
                uniqueEmailArray.add(uniqueEmail);
            }
        }

        return uniqueEmailArray.size();
    }
}
