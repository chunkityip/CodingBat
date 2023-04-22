package Logic1;

public class in1To10 {

    public static void main (String [] args) {
        System.out.println(in1To10(5, false));
        System.out.println(in1To10(11, false));
        System.out.println(in1To10(11, true) );
    }

    public static boolean in1To10(int n, boolean outsideMode) {
  /*
  Situation:
  1. outsideMode is true
  2. n >= 1 && n <= 10
  */

        if (outsideMode) {
            return n <= 1 || n >= 10;
        }

        return  n >= 1 && n <= 10;
    }

}
