package String;

public class right2 {

    /*
    Given a string, return a "rotated right 2" version where the
    last 2 chars are moved to the start. The string length will be at least 2.

        right2("Hello") → "loHel"
        right2("java") → "vaja"
        right2("Hi") → "Hi"
     */

    public static void main (String[] args) {
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
    }

    public static String right2(String str) {
        if (str.length() <= 2) return str;
        int length = str.length() - 2;
        return str.substring(length) + str.substring(0 , length);
    }
}