package String2;

public class doubleChar {

    public static void main (String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There") );
    }

    public static String doubleChar(String str) {
        if (str.length() == 0) return "";

        String ans = "";
        for (int i = 0; i< str.length(); i++) {
            ans = ans + str.charAt(i) + str.charAt(i);
        }

        return ans;
    }

}
