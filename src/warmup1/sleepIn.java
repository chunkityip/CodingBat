package warmup1;

import com.sun.tools.javac.Main;

public class sleepIn {

    /*
    The parameter weekday is true if it is a weekday,
    and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation.
    Return true if we sleep in.

        warmup1.sleepIn(false, false) → true
        warmup1.sleepIn(true, false) → false
        warmup1.sleepIn(false, true) → true
     */
    public static void main(String[] args) {
        System.out.println(sleepIn(false , false));
        System.out.println(sleepIn(true , false));
        System.out.println(sleepIn(false, true));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }
}