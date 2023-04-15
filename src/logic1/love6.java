package logic1;

public class love6 {

    public static void main(String [] args) {
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 5));
        System.out.println(love6(1, 5));
    }

    public static boolean love6(int a, int b) {
  /*
  Situation:
  1. Sum is 6
  2. Difference is 6
  3. a is 6
  4. b is 6
  */

        int sum = a + b;
        int diff = Math.abs(a - b);

        return sum == 6 || diff == 6 || a == 6 || b == 6;
    }

}
