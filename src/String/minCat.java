package String;

public class minCat {
    /*
    Given two strings, append them together (known as "concatenation")
    and return the result. However, if the strings are different lengths,
    omit chars from the longer string so it is the same length as the
    shorter string. So "Hello" and "Hi" yield "loHi".
    The strings may be any length.


        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"
     */
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }

    public static String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();


        if (aLength == bLength) ;

        if (aLength > bLength)  {
            int cut = aLength - bLength;
            a = a.substring(cut , aLength);
        }

        if (aLength < bLength) {
            int cut = bLength - aLength;
            b = b.substring(cut , bLength);
        }

        return a + b;
    }

    /*
    Another way of doing this:
        public String minCat(String a, String b) {
        int min = Math.min(a.length(), b.length());
        return a.substring(a.length() - min) + b.substring(b.length() - min);
}
     */

    
}
