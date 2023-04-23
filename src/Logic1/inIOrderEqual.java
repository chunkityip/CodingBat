package Logic1;

public class inIOrderEqual {

    public static void main (String [] args) {
        System.out.println(inOrderEqual(2, 5, 11, false));
        System.out.println(inOrderEqual(5, 7, 6, false));
        System.out.println(inOrderEqual(5, 5, 7, true));
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {

  /* Situations:
  1. if (equalOk) return a == b >= c;
  2. return b >= a + 1 && c >= b + 1;
  */

        if (equalOk) return b >= a && c >= b;
        return b > a  && c > b;
    }
}
