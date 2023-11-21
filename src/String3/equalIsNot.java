package String3;

public class equalIsNot {

    public static void main (String [] args) {
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }

    public static boolean equalIsNot(String str) {

        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if ("is".equals(str.substring(i , i + 2))) countIs++;
            //i < str.length() - 2 to avoid IndexOutOfBound
            if (i < str.length() - 2 && "not".equals(str.substring(i , i + 3))) countNot++;
        }

        return countIs == countNot;
    }

}
