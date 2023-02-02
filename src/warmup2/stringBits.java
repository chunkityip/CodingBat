package warmup2;

public class stringBits {

    public static void main (String [] args) {
        /*
        Given a string, return a new string made
        of every other char starting with the first, so "Hello" yields "Hlo".

        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"
         */
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    public static String stringBits(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i+=2) {
            ans +=str.substring(i , i + 1);
        }
        return ans;
    }
}
