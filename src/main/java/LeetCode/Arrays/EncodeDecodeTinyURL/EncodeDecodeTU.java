package main.java.LeetCode.Arrays.EncodeDecodeTinyURL;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EncodeDecodeTU {

    private Map<String, String> tinyURLMap = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String link = longUrl.substring(longUrl.indexOf("//")+2);
        String tinyLink = String.valueOf(UUID.randomUUID()).replaceAll("_", "");
            return "";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    return "";
    }
}
