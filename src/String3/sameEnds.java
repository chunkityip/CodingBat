package String3;

public class sameEnds {

    public static void main (String[] args) {
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx") );
    }

    public static String sameEnds(String string) {
        int len = string.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len / 2; i++) {
            String sub = string.substring(0, i + 1);

            if (string.endsWith(sub) && sub.length() > sb.length()) {
                sb = new StringBuilder(sub);
            }
        }

        return sb.toString();
    }
}
