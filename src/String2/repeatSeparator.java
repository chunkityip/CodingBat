package String2;

public class repeatSeparator {

    public static void main (String [] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        if (count == 1) return word;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(word);

            /*
            If the i is less than count - 1 , we are adding sep , else , skip it
            Ex: i = 0 , i is less than 3 - 1 , add "X"
            i = 1 , i is less than 3 - 1 , add "X"
            i = 2 , i isn't less than 3 - 1 , we are not adding "X"
             */
            if (i < count - 1) sb.append(sep);
        }

        return sb.toString();
    }
}
