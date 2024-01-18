package main.java.LeetCode.TwoPointer.MergeStringsAlternately;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder stringBuilder = new StringBuilder();
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        int length = Math.min(word1Array.length, word2Array.length);
        String maxLengthWord = word1.length() > word2.length() ? word1 : word2;

        for (int i = 0; i < length; i++) {
            stringBuilder.append(word1Array[i]);
            stringBuilder.append(word2Array[i]);
        }

        stringBuilder.append(maxLengthWord.substring(length));

        return stringBuilder.toString();
    }
}
