package String2;

public class wordEnds {

    public static void main (String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }

    public static String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int wordLength = word.length();
        int strLength = str.length();

        for (int i = 0; i < strLength - wordLength + 1; i++) {
            if (str.substring(i, i + wordLength).equals(word)) {
                //If the n + 1 index is word , add the m char of it (return a string made of each char just before)
                if (i > 0) {
                    sb.append(str.charAt(i - 1));
                }
                //return a string made of each char after every appearance of the word in the string
                if (i + wordLength < strLength) {
                    sb.append(str.charAt(i + wordLength));
                }
            }
        }

        return sb.toString();
    }
}
