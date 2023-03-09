package Warmup1;

public class sumDouble {
    /*
    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
        warmup1.sumDouble(1, 2) → 3
        warmup1.sumDouble(3, 2) → 5
        warmup1.sumDouble(2, 2) → 8
     */

    public static void main (String[] args) {
        System.out.println(sumDouble(1 , 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2 ,2));
    }

    public static int sumDouble(int a , int b) {
        int sum = a + b;
        if (a == b)  {
            sum = sum * 2;
        }
        return sum;
    }
    //Or

    /*
    public static int warmup1.sumDouble(int a, int b) {
        return ((a == b)? 2 * (a + b) : a + b);
    }
     */
}
