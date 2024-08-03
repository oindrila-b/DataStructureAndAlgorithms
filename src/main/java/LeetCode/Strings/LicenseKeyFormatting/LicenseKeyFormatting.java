package main.java.LeetCode.Strings.LicenseKeyFormatting;

import java.util.Arrays;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        String[] keys = s.split("-");
        String dash = "-";
        System.out.println(Arrays.toString(keys));
        StringBuilder formattedKey = new StringBuilder();

        for (int i = 0; i < keys.length; i++) {
            if (i ==0) {
                if ( keys[i].length() <= k) {
                    formattedKey.append(keys[i]);
                    formattedKey.append(dash);
                    System.out.println(formattedKey);
                }else {

                }

            }
        }

        return "";
    }

}
