package String3;

public class sumNumbers {

    public static void main (String [] args) {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));

    }

    public static int sumNumbers(String str) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0); // Reset the temporary string
                }
            }
        }

        if (sb.length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }

        return sum;
    }
}
