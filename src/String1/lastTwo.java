package String1;

public class lastTwo {

    /*
    Given a string of any length, return a new string where the last 2 chars,
    f present, are swapped, so "coding" yields "codign".


        lastTwo("coding") → "codign"
        lastTwo("cat") → "cta"
        lastTwo("ab") → "ba"
     */

    public static void main (String [] args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat") );
        System.out.println(lastTwo("ab"));
    }

    public static String lastTwo(String str) {
        if (str.length() <= 1) return str;
        char lastChar = str.charAt(str.length() - 1);
        char lastSecChar = str.charAt(str.length() - 2);

        return str.substring(0 , str.length() - 2) + lastChar + lastSecChar;
    }
}
