package Logic2;

public class makeChocolate {

    public static void main (String [] args) {
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
    }

    public static int makeChocolate(int small, int big, int goal) {

        if (big * 5 + small < goal || small < goal % 5) return -1;

        //if we can't use big to compelete the goal , use small instead
        if (big * 5 <= goal) return goal - big * 5;

        //if we can use big to compelete the goal , use big
        return goal % 5;
    }

}
