package Logic1;

public class withoutDoubles {

    public static void main (String[] args) {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles(3, 3, true));
        System.out.println(withoutDoubles(3, 3, false));
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {

        int sum = die1 + die2;

        if (noDoubles) {
            //wrapping around to 1 if its value was 6
            if (die1 == 6 && die2 == 6) {
                sum = 1 + 6;
                //if noDoubles is true, if the two dice show the same value, increment one die to the next value
            } else if (die1 == die2) {
                sum += 1;
            }
        }
        return sum;
    }
}
