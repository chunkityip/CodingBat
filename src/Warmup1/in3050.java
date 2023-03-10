package Warmup1;

public class in3050 {

    /*
    Given 2 int values, return true if they are both in the range 30..40
    inclusive, or they are both in the range 40..50 inclusive.
        in3050(30, 31) → true
        in3050(30, 41) → false
        in3050(40, 50) → true
     */
    public static void main (String[] args) {
        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
    }

    public static boolean in3050(int a , int b) {
        boolean in3040 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
        boolean in4050 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);

        return in3040 || in4050;
    }
}
