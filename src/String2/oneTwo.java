package String2;

public class oneTwo {


    public static void main (String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
    }

    public static String oneTwo(String str) {
        if (str.length() <= 2) return "";

        //second and thrid char will be first and second , the first char will move to third
        //2 , 3                                                1
        //5 , 6                                                4

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            sb.append(str.substring(i + 1 , i + 3)).append(str.charAt(i));
        }

        return sb.toString();
    }

}
