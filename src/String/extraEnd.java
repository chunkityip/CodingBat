package String;

public class extraEnd {
    /*
    Given a string, return a new string made of 3 copies of the last 2 chars
    of the original string. The string length will be at least 2.

    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi""

     */
    public static void main(String [] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }

    public static String extraEnd(String str) {
        int length = str.length() - 2;
        String lastChars = str.substring(length);
        return lastChars + lastChars + lastChars;
    }

}
