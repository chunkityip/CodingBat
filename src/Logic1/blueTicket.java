package Logic1;

public class blueTicket {

    public static void main (String[] args) {
        System.out.println(blueTicket(9, 1, 0));
        System.out.println(blueTicket(9, 2, 0));
        System.out.println(blueTicket(6, 1, 4) );
    }

    public static int blueTicket(int a, int b, int c) {

      /*
      3 situations :
      1. a + b = 10 || b + c = 10 || a + c = 10 , return 10
      2. a + b > b + c + 10 || a + b > a + c + 10 , return 5
      3. else . return 0
      */

        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) return 10;
        if (ab >= bc + 10 || ab >= ac + 10) return 5;

        return 0;
    }

}
