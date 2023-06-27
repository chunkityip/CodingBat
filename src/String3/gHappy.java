package String3;

public class gHappy {

    public static void main (String [] args) {
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
    }

    public static boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if ((i > 0 && str.charAt(i - 1) == 'g') ||
                        (i < str.length() - 1 && str.charAt(i + 1) == 'g')) {
                    // Current 'g' is happy, continue to the next character
                    continue;
                } else {
                    // Current 'g' is not happy, return false
                    return false;
                }
            }
        }
        return true;
    }
}
