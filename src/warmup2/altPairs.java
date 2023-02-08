package warmup2;

public class altPairs {

    /*
    Given a string, return a string made of the chars at
    indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

        altPairs("kitten") → "kien"
        altPairs("Chocolate") → "Chole"
        altPairs("CodingHorror") → "Congrr"
     */

    public static void main (String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str) {
        String ans = "";
        //Index (0,1) , (4,5) , (8,9)...All about a number plus 4
        //0 + 4 = 4 , 1 + 4 = 5......... so the loop should i += 4
        for (int i = 0; i < str.length(); i += 4) {
            //Since index start as 0 , when we are using substring as index 1 , we have to use + 2
            int end = i + 2;
            //The end of the length
            if (end > str.length()) {
                end = str.length();
            }
            ans += str.substring(i , end);
        }
        return ans;
    }

}
