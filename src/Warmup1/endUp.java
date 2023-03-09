package Warmup1;

public class endUp {
    /*
    Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there.
    Note that str.toUpperCase() returns the uppercase version of a string.

        endUp("Hello") → "HeLLO"
        endUp("hi there") → "hi thERE"
        endUp("hi") → "HI"
     */
    public static void main (String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }

    public static String endUp(String str) {
        int length = str.length();
        if (length <= 3) return str.toUpperCase();

        int block = length - 3;

        String front = str.substring(0 , block);
        String back = str.substring(block);

        return front + back.toUpperCase();

    }
}
