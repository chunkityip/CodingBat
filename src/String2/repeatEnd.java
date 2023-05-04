package String2;

public class repeatEnd {

    public static void main (String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }

    public static String repeatEnd(String str, int n) {
        if (n == 0) return "";

        StringBuilder ans = new StringBuilder();
        for (int i = 0 ; i < n; i++) {
            ans.append(str.substring(str.length() - n));
        }

        return ans.toString();
    }
}
