package Warmup1;

public class makes10 {

    /*
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        warmup1.makes10(9, 10) → true
        warmup1.makes10(9, 9) → false
        warmup1.makes10(1, 9) → true
     */
    public static void main (String [] args) {
        System.out.println(makes10(9 , 10));
        System.out.println(makes10(9 , 9));
        System.out.println(makes10(1 , 9));
    }

    public static boolean makes10(int a , int b) {
        int sum = a + b;
        return ((a == 10) || (b == 10) || (sum == 10));
    }
}
