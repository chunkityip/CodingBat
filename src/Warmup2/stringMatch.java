package Warmup2;

public class stringMatch {
    /*
    Given 2 strings, a and b, return the number of the positions where
    they contain the same length 2 substring.

    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
    substrings appear in the same place in both strings.

        stringMatch("xxcaazz", "xxbaaz") → 3
        stringMatch("abc", "abc") → 2
        stringMatch("abc", "axc") → 0
     */
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }

    public static int stringMatch(String a, String b) {
        /*
        Because I am comparing a and b , once I know which String is the shortest
        , I can use that length to loop searching the matching character
         */
        int length = Math.min(a.length(), b.length());
        int count = 0;

        //Now we are searching the same length 3 substring so i and i + 2
        for (int i = 0; i < length - 1; i++) {
            String aString = a.substring(i, i + 2);
            String bString = b.substring(i, i + 2);

            if (aString.equals(bString)) count++;
        }
        return count;
    }
}
