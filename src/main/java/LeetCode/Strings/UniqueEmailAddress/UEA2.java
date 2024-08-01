package main.java.LeetCode.Strings.UniqueEmailAddress;

import java.util.HashSet;

public class UEA2 {

        public int numUniqueEmails(String[] emails) {
            HashSet<String> uniqueEmails = new HashSet<>();

            for (String email : emails) {
                uniqueEmails.add(getFilteredEmail(email));
            }

            return uniqueEmails.size();
        }

        private String getFilteredEmail(String email) {
            StringBuilder filteredLocal = new StringBuilder();
            boolean ignore = false;
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                if (c == '@') {
                    filteredLocal.append(email.substring(i));
                    break;
                } else if (c == '+') {
                    ignore = true;
                } else if (c != '.' && !ignore) {
                    filteredLocal.append(c);
                }
            }
            return filteredLocal.toString();
        }
    }

