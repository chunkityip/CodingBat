package String3;

public class notReplace {

    public static void main (String[] args) {
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
    }

    public static String notReplace(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i + 1 < length && str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                // Check if "is" is not surrounded by letters
                if ((i - 1 < 0 || !Character.isLetter(str.charAt(i - 1))) &&
                        (i + 2 == length || !Character.isLetter(str.charAt(i + 2)))) {
                    sb.append("is not");
                    i++; // Skip the next character since we have already processed it
                } else {
                    sb.append(str.charAt(i));
                }
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
