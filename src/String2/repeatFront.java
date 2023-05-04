package String2;

public class repeatFront {

    public static void main (String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));
    }

    public static String repeatFront(String str, int n) {
        if (n == 0) return "";

        StringBuilder ans = new StringBuilder();
        for (int i = n ; i >= 0 ; i--) {
            ans.append(str.substring(0 , i));
        }

        return ans.toString();
    }
}
