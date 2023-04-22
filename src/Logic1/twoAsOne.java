package Logic1;

public class twoAsOne {

    public static void main (String [] args) {
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        System.out.println(twoAsOne(3, 2, 2));
    }

    public static boolean twoAsOne(int a, int b, int c) {

  /*
  3 situations:
  1. a + b = c
  2. a + c = b
  3. b + c = a;

  */
        return a + b == c || a + c == b || b + c == a;
    }
}
