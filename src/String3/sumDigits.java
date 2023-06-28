package String3;

public class sumDigits {

    public static void main (String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));
    }

    public static int sumDigits(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count += Integer.parseInt(str.substring(i , i + 1));
            }
        }
        return count;
    }
}
