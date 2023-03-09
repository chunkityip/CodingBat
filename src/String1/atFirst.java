package String1;

public class atFirst {
    /*

    Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.


    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static String atFirst(String str) {
        int length = str.length();

        if (length == 0) return str + "@@";
        if (length < 2) return str + "@";
        if (length == 2) return str;

        return str.substring(0, 2);
    }
}
