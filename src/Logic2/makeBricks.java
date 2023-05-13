package Logic2;

public class makeBricks {

    public static void main (String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
    }

    public static boolean makeBricks(int small, int big, int goal) {

        if (goal > (big * 5) + small) return false;


        //we mod goal by 5(big) , if the number is less or equal to small , return true
        return goal % 5 <= small;
    }
}
