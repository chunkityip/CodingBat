package String1;

public class lastChars {

    /*
    Given 2 strings, a and b, return a new string made of the first char of a
    and the last char of b, so "yo" and "java" yields "ya".
    If either string is length 0, use '@' for its missing char.


        lastChars("last", "chars") → "ls"
        lastChars("yo", "java") → "ya"
        lastChars("hi", "") → "h@"
     */

    public static void main(String [] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }

    public static String lastChars(String a, String b) {
        String first = "@";
        String last = "@";

        if (a.length() > 0) first = a.substring(0 , 1);
        if (b.length() > 0) last = b.substring(b.length() - 1);

        return first + last;
    }
}

