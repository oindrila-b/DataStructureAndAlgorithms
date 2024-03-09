package main.java.LeetCode.Arrays.EncodeDecodeTinyURL;

public class Main {
    public static void main(String[] args) {
        EncodeDecodeTU encodeDecodeTU = new EncodeDecodeTU();
        String url = encodeDecodeTU.encode("http://leetcode.com/problems/design-tinyurl");
        encodeDecodeTU.decode(url);
    }
}
