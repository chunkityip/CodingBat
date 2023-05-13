package Logic2;

public class loneSum {

    public static void main (String [] args) {
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
    }

    public static int loneSum(int a, int b, int c) {

        //if a == c , return b || a == b , return c
        //if b == a , return c || b == c , return a
        //if c == a , return b || c == b , return a

        //else , return 0

        if (a == b && a == c) return 0;
        if (b == c)  return a;
        if (a == c)  return b;
        if (a == b)  return c;

        return a + b + c;
    }
}
