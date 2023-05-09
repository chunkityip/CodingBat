package String2;

public class repeatSeparator {

    public static void main (String [] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            sb.append(word);
            if (i != count) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }
}
