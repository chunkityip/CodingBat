package String2;

public class countHi {

    public static void main (String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
    }

    public static int countHi(String str) {
        if (str.length() <= 1) return 0;

        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i , i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    /*Another way to do so:
        // Replace all occurrences of "hi" with an empty string
        String stringWithoutHi = str.replace("hi", "");

         // Calculate the difference in length between the original string and the modified string
         int count = (str.length() - stringWithoutHi.length()) / 2;

        return count;
     */
}
