package Warmup1;

public class frontBack {

/*
    Given a string, return a new string where the first and last chars have been exchanged.
        frontBack("code") → "eodc"
        frontBack("a") → "a"
        frontBack("ab") → "ba"
 */

    public static void main (String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }



    public static String frontBack(String str) {
        int length = str.length();
        if (length <= 1) return str;

        return str.charAt(length - 1) + str.substring(1 , length - 1) + str.charAt(0);
    }
}
