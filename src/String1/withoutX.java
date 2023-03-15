package String1;

public class withoutX {

    /*
    Given a string, if the first or last chars are 'x', return
    the string without those 'x' chars, and otherwise return the string unchanged.


        withoutX("xHix") → "Hi"
        withoutX("xHi") → "Hi"
        withoutX("Hxix") → "Hxi"

     */

    public static void main (String [] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }

    public static String withoutX(String str) {
        int first = 0;
        int last = str.length();

        if (str.length() > 0 && str.charAt(0) == 'x') first = 1;
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') last--;

        return str.substring(first , last);
    }
}
