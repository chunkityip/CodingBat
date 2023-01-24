package warmup1;

public class front22 {

    public static void main(String[] args) {

        /*
        Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
        so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

        front22("kitten") → "kikittenki"
        front22("Ha") → "HaHaHa"
        front22("abc") → "ababcab"
         */

        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println("abc");
    }

    public static String front22(String str) {
        int length = str.length();
        String answer;

        if (length > 2) {
            String front = str.substring(0 , 2);
            answer = front + str + front;
        } else {
            answer = str + str + str;
        }

        return answer;
    }
}
