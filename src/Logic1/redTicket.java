package Logic1;

public class redTicket {
    public static void main (String[] args) {
        System.out.println(redTicket(2, 2, 2));
        System.out.println(redTicket(2, 2, 1));
        System.out.println(redTicket(0, 0, 0));
    }

    public static int redTicket(int a, int b, int c) {

      /*
      1. if sum = 6 , return 10
      2. if sum = 3 || sum == 0 , return 5
      3. if (b != a && c != a) return 1
      4. else , return 0
      */

        if (a + b + c == 6) return 10;
        if (a == b && b == c) return 5;
        if (b != a && c != a) return 1;

        return 0;
    }
}
