package String2;

public class sameStarChar {
    public static void main (String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
    }


    public static boolean sameStarChar(String str) {

        //using i = 1 because we are comparing str.charAt(i - 1) && str.charAt(i + 1)
        //Regarding the placement of return false , once we know the char isn't * , it just returns false
        //This optimization allows us to exit early and avoid unnecessary iterations if the condition is not met
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) return false;
        }
        return true;
    }



}
