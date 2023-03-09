package Warmup2;

public class stringSplosion {
    /*

        Given a non-empty string like "Code" return a string like "CCoCodCode".

        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"
     */
    public static void main (String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String str) {
  /*
  Here is the pattern
  C + Co + Cod + Code
  It means it will increase a string following by the loop of the i as (i . i + 1)
  C as (0 ,1)
  Co as (0 , 2)
  Cod as (0 , 3)
  Code as (0 , 4)
  so basically we just need to use the loop of i and substring() methid
  */
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans += str.substring(0 , i + 1);
        }
        return ans;
    }

}
