package String2;

public class xyzThere {

    public static void main (String [] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    // This program checks if a string contains the substring "xyz" at least once.
    // It returns true if so, and false otherwise
    public static boolean xyzThere(String str) {
        if(str.length() >= 3 && "xyz".equals(str.substring(0, 3)))
            return true;
        for(int i = 1; i < str.length() - 2; i++) {
            if(str.charAt(i - 1) != '.' && "xyz".equals(str.substring(i, i + 3)))
                return true;
        }
        return false;
    }

    /*
    Another way to do so :
    String modifiedStr = str.replace(".xyz", "###");
    return modifiedStr.contains("xyz");

    replace all the .xyz to something else . then we are checking is str still have any "xyz" left
     */
}
