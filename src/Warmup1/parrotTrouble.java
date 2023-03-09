package Warmup1;

public class parrotTrouble {

    /*
    We have a loud talking parrot.
    The "hour" parameter is the current hour time in the range 0..23.
    We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

        warmup1.parrotTrouble(true, 6) → true
        warmup1.parrotTrouble(true, 7) → false
        warmup1.parrotTrouble(false, 6) → false
     */

    public static void main (String[] args) {
        System.out.println(parrotTrouble(true , 6));
        System.out.println(parrotTrouble(true , 7));
        System.out.println(parrotTrouble(false , 6));
    }

    public static boolean parrotTrouble(boolean talking , int hour) {
        return talking && hour < 7 || talking && hour > 20;
    }
}
