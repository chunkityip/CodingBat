package String1;

public class firstHalf {
    /*
    Given a string of even length, return the first half.
    So the string "WooHoo" yields "Woo".


    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
     */
    public static void main (String [] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }

    public static String firstHalf(String str) {
        int length = str.length() / 2;
        return str.substring(0 , length);
    }
}
