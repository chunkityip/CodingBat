package Warmup2;

public class last2 {
    /*

    Given a string, return the count of the number of times
    that a substring length 2 appears in the string
    and also as the last 2 chars of the string,
    so "hixxxhi" yields 1 (we won't count the end substring).

        last2("hixxhi") → 1
        last2("xaxxaxaxx") → 1
        last2("axxxaaxx") → 2
     */

    public static void main (String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }

    public static int last2(String str) {
        int length = str.length();
        if (length < 2) return 0;

        //Making sure we only count the last 2 char of the string
        String last2char = str.substring(length - 2);

        int count = 0;
        for (int i = 0; i < length - 2; i++) {
            //Cause we are counting the substring length 2 appears in the string , so , i + 2
            String sub = str.substring(i , i + 2);
            if (sub.equals(last2char)) {
                count++;
            }
        }
        return count;
    }
}
