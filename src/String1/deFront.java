package String1;

public class deFront {

    /*
    Given a string, return a version without the first 2 chars.
    except keep the first char if it is 'a' and keep the second char
    if it is 'b'. The string may be any length. Harder than it looks.


    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"
     */

    public static void main (String [] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }

    public static String deFront(String str) {
        if (str.length() == 1 && str.charAt(0) != 'a') return "";
        String ans = str.substring(2 , str.length());
        if (str.charAt(0) == 'a') ans = str.charAt(0) + str.substring(2);
        if (str.charAt(1) == 'b') ans = str.charAt(1) + str.substring(2);
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            ans = str;
        };

        return ans;
    }
}
