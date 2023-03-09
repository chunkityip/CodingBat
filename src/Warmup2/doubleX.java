package Warmup2;

public class doubleX {
    /*
    Given a string, return true if the first instance of "x"
    in the string is immediately followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */
    public static void main (String [] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

    public static boolean doubleX(String str) {
        int count = str.indexOf("x");
        if (count == -1) return false;
        if (count + 1 >= str.length()) return false;

        return str.substring(count + 1 , count + 2).equals("x");
    }

    /* Another way of doing this is to use startWith() method
    boolean doubleX(String str) {
        int count = str.indexOf("x");
        if (count == -1) return false;
        if (count + 1 >= str.length()) return false;

        String x = str.substring(count);
            return x.startsWith("xx");
    }
    */
}
