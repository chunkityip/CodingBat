package Logic2;

public class blackjack {

    public static void main (String [] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
    }

    public static int blackjack(int a, int b) {

        // 1. if a and b both go over 21 , return 0
        // 2. if a < 21 and b > 21 || Math.abs(a - 21) < Math.abs(b - 21) , return a
        // 3. if a > 21 and b < 21 || Math.abs(a - 21) > Math.abs(b - 21) , return b

        if (a > 21 && b > 21) return 0;

        if (a > 21) return b;
        if (b > 21) return a;


        return a > b ? a : b;
    }

}
