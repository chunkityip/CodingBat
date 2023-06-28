package String3;

public class countTriple {

    public static void main (String [] args) {
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }

    public static int countTriple(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char currentChar = str.charAt(i);

            if (currentChar == str.charAt(i + 1) && currentChar == str.charAt(i + 2)) {
                count++;
            }
        }

        return count;
    }

}

