package warmup1;

public class monkeyTrouble {

    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

        warmup1.monkeyTrouble(true, true) → true
        warmup1.monkeyTrouble(false, false) → true
        warmup1.monkeyTrouble(true, false) → false
     */

    public static void main (String[] args) {
        System.out.println(monkeyTrouble(true , true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return ((aSmile && bSmile) || (!aSmile && !bSmile));
    }
}
