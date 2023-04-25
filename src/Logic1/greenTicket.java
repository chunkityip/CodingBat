package Logic1;

public class greenTicket {

    public static void main (String [] args) {
        System.out.println(greenTicket(1, 2, 3));
        System.out.println(greenTicket(2, 2, 2));
        System.out.println(greenTicket(1, 1, 2));
    }

    public static int greenTicket(int a, int b, int c) {

        if (a != b && b != c && a != c) return 0;
        if (a == b && b == c && a == c) return 20;

        return 10;

    }
}
