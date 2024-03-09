package main.java.LeetCode.Arrays.EncodeDecodeTinyURL;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EncodeDecodeTU {

    private int length = 7;

    private String http = "";
    private  final String baseTinyURL = "tinyurl.com/";

    private Map<String, String> tinyURLMap = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        http = longUrl.substring(0, longUrl.indexOf("://") +3);
        System.out.println(http);
        String link = longUrl.substring(longUrl.indexOf("//")+2);
        String tinyLink = String.valueOf(UUID.randomUUID()).replaceAll("-", "").substring(0,length);
        tinyURLMap.put(tinyLink, link);
        String encodedLink = http+baseTinyURL+tinyLink;
        System.out.println(encodedLink);
        return encodedLink;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String id = shortUrl.substring(shortUrl.indexOf(".com/")+5);
        String originalLink =  tinyURLMap.get(id);
        String decodedLink = http+originalLink;
        System.out.println(decodedLink);

    return decodedLink;
    }
}


/**
 *
 *    // Encodes a URL to a shortened URL.
 *     public String encode(String longUrl) {
 *         return longUrl;
 *     }
 *
 *     // Decodes a shortened URL to its original URL.
 *     public String decode(String shortUrl) {
 *         return shortUrl;
 *     }
 *
 *
 * **/