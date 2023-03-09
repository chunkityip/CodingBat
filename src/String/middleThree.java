package String;

public class middleThree {
    /*
    Given a string of odd length, return the string length 3 from its middle,
    so "Candy" yields "and". The string length will be at least 3.


    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
     */
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }

    public static String middleThree(String str) {
        if (str.length() == 3) return str;

        //We are using int so it isn't return 0.x number. It is Double
        int mid = str.length() / 2;

        return str.substring(mid - 1, mid + 2);
    }
}
