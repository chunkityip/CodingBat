package Warmup2;

public class stringX {
    /*
    Given a string, return a version where all the "x"
    have been removed. Except an "x" at the very start or end
    should not be removed.

        stringX("xxHxix") → "xHix"
        stringX("abxxxcd") → "abcd"
        stringX("xabxxxcdx") → "xabcdx"
        Testing
     */
    public static void main (String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    public static String stringX(String str) {
        if (str.length() <= 2) return str;
        //start + middle + end

        //Start will set as index 0
        char start = str.charAt(0);

        //The middle will set up between 1 to last of the length , as the replace method , it
        //will replace empty if it is "x"
        String middle = str.substring(1 , str.length() -1).replace("x" , "");

        //End will set as last of the length;
        char end = str.charAt(str.length() - 1);

        String ans = start + middle + end;
        return ans;
    }
}
