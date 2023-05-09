package String1;

public class endsLy {
    /*
        Given a string, return true if it ends in "ly".

        endsLy("oddly") → true
        endsLy("y") → false
        endsLy("oddy") → false
     */
    public static void main (String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }

    public static boolean endsLy(String str) {
        int length = str.length();
        if (length < 2) return false;
        return str.substring(str.length() -2).equals("ly");
    }

    /*
    or
    if (str.length() <= 1) return false;
    return (str.endsWith("ly"));
     */
}
