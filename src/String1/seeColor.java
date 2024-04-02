package String1;

public class seeColor {

    /*
    Given a string, if the string begins with "red" or "blue"
    return that color string, otherwise return the empty string.


        seeColor("redxx") → "red"
        seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"
     */

    public static void main (String[] args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }

    public static String seeColor(String str) {
        int length = str.length();

        if (length >= 3 && "red".equals(str.substring(0 , 3)))  return "red";
        if (length >= 4 && "blue".equals(str.substring(0 , 4))) return "blue";

        return "";
    }
}
