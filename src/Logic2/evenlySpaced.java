package Logic2;

public class evenlySpaced {

    public static void main (String [] args) {

    }

    public static boolean evenlySpaced(int a, int b, int c) {

        return ((a + b) == c * 2) ||
                ((a + c) == b * 2) ||
                ((b + c) == a * 2);
    }

    //or
    /*
    public boolean evenlySpaced(int a, int b, int c) {

        int small = Math.min(a,b);
        small = Math.min(small,c);

        int large = Math.max(a,b);
        large = Math.max(large,c);
        //It using double because of  this situation : evenlySpaced(4, 6, 3) → false
        //                                             6 + 3 / 2 = 4.5
        double average = (small + large) / 2.0;

        return a == average || b == average || c == average;

    }
*/
}
