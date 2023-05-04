package String2;

public class xyBalance {

    public static void main (String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }

    public static boolean xyBalance(String str) {
        return str.lastIndexOf("y") > str.lastIndexOf("x") ||
                str.lastIndexOf("y") == str.lastIndexOf("x");
    }
    /**
     * boolean y = false;
     *     for(int i = str.length() - 1; i >= 0; i--) {
     *         if(str.charAt(i) == 'y')
     *             y = true;
     *
     *         if(str.charAt(i) == 'x' && !y)
     *             return false;
     *     }
     *
     *     return true;
     */
}
