package String2;

public class mixString {

    public static void main (String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String a, String b) {
        if (a.length() == 0 && b.length() == 0) return "";

        int maxLength = Math.max(a.length() , b.length());
        StringBuilder ans = new StringBuilder();
        for (int i = 0 ; i < maxLength; i++) {
            if (i < a.length()) ans.append(a.charAt(i));
            if (i < b.length()) ans.append(b.charAt(i));
        }
        return ans.toString();
    }

}
