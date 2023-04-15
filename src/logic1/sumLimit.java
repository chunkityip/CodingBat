package logic1;

public class sumLimit {

    public static void main (String [] args) {
        System.out.println(sumLimit(2, 3));
        System.out.println(sumLimit(8, 3));
        System.out.println(sumLimit(8, 1));
    }


    //Two ways of doing this , one is using valueOf , second is using Integer.toString()
    public static int sumLimit(int a, int b) {

        int sum = String.valueOf(a + b).length();;
        int aLen = String.valueOf(a).length();

        if (sum > aLen) return a;

        return a + b;
    }

    /*
    public static int sumLimit(int a, int b) {

        String sum = Integer.toString(a + b);
        String aLen = Integer.toString(a);

        if (sum.length() > aLen.length()) return a;

        return a + b;
     */

}
