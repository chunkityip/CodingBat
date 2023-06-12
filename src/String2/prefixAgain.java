package String2;

public class prefixAgain {

    public static void main (String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc", 2));
        System.out.println(prefixAgain("abXYabc", 3));
    }

    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0 , n);
        String rest = str.substring(n);

        return rest.contains(prefix);
    }
}
