package String2;

public class bobThere {

    public static void main (String[] args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));
    }

    public static boolean bobThere(String str) {
        if (str.length() <= 2) return false;
        //.*b[0-9a-z]b.* matches any string that contains the pattern "b" followed by any alphanumeric character and
        // then followed by another "b", regardless of where the pattern appears in the string.
        // The .* before and after the pattern means that any characters (zero or more times) can occur before and
        // after the pattern in the string.
        return str.matches(".*b[0-9a-z]b.*");

    }
}
