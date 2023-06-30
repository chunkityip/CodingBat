package String3;

public class mirrorEnds {

    public static void main (String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }

    public static String mirrorEnds(String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                sb.append(string.charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
