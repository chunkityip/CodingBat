package logic1;

public class answerCell {

    public static void main (String [] args) {
        System.out.println(answerCell(false, false, false));
        System.out.println(answerCell(false, false, true));
        System.out.println(answerCell(true, false, false));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

  /*
  The priority of logic:
  if (isAsleep) return false;
  if (isMorning && !isMom) return false;

  return true
  */

        if (isAsleep) return false;
        if (isMorning && !isMom) return false;

        return true;
    }
}
