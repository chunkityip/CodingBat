package String2;

public class starOut {

    public static void main (String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
    }

    public static String starOut(String str) {

        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0 ; i < len; i++) {
            //If index i is '*' , continue the loop , else go to next if statement
            if (str.charAt(i) == '*') continue;

            //If index i > 0 and index i is '*' , continue the loop , else go to next if statement
            if (i > 0 && str.charAt(i - 1) == '*') continue;

            //set i < len -1 for avoid indexOutOfBound
            //If index i is '*', continue the loop , else go to next if statement
            if (i < len - 1 && str.charAt(i + 1) == '*') continue;

            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    /*
    A version without using continue
    public String starOut(String str) {

      StringBuilder sb = new StringBuilder();
      int len = str.length();
      for (int i = 0; i < len; i++) {
            if (str.charAt(i) != '*' &&
            (i == 0 || str.charAt(i - 1) != '*') &&
            (i == len - 1 || str.charAt(i + 1) != '*')) {
                sb.append(str.charAt(i));
            }
        }
      return sb.toString();
    }
     */
}
