package Logic2;

public class makeBricks {

    public static void main (String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
    }

    /*
    We use Math.min(goal/5, big) to determine the maximum number of big bricks that can be
    used to reach the goal. This value is multiplied by 5 to calculate the total size of the
    big bricks used. Then, we subtract this total from the goal to get the remaining
    size that needs to be filled using small bricks. If this remaining size is less than or
    equal to the available small bricks, the goal can be achieved, and we return true.
    Otherwise, we return false.
     */
    public static boolean makeBricks(int small, int big, int goal) {
        return goal - Math.min(goal / 5, big) * 5 <= small;
    }
    /*
    public static boolean makeBricks(int small, int big, int goal) {

        if (goal > (big * 5) + small) return false;

        //we mod goal by 5(big) , if the number is less or equal to small , return true
        return goal % 5 <= small;
    }
     */
}
