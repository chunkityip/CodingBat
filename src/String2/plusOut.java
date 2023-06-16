package String2;

public class plusOut {

    public static void main (String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

    public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        int wordLength = word.length();

        for (int i = 0; i < str.length(); i++) {
            //make out to avoid indexOutOfBound
            if (i <= str.length() - wordLength &&
                    //to check if the substring is equals to word
                    str.substring(i, i + wordLength).equals(word)) {
                sb.append(word);
                //To skip over the characters of the word in the next iteration
                i += wordLength - 1;
            } else{
                sb.append("+");
            }
        }
        return sb.toString();
    }

}
