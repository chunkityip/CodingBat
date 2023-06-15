package String2;

public class zipZap {

    public static void main (String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }

    public static String zipZap(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 1; i < sb.length() - 1; i++){
            if(sb.charAt(i - 1) == 'z' && sb.charAt(i + 1) == 'p'){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

    /*Another way to doing so
    public String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }
     */
}
