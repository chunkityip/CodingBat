package warmup1;

public class notString {

    public static void main (String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }


    /*
    1. The reason of (length >= 3) is because if the length of String is less than 2 , we know it isn't "not" . Therefore , it just
        simply go to line 16 which adding "not" on it
    2. str.substring(0 , 3).equals("not"). By checking the first 3 index (0 to 2) to check is "not" or not using String equals() method
     */
    public static String notString(String str) {
        int length = str.length();
        if (length >= 3 && str.substring(0 , 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }


    /*The most straightforward solution is using String startsWith() method:

        public static String notString(String str) {
            int length = str.length();
            return (length >= 3 && str.startsWith("not"))? str : "not " + str;
        }
     */

}
