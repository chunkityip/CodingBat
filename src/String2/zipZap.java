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

    /*
    Without using any buildin method
     StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        // Check if the current character is 'z' and the next character is 'p'
        if (str.charAt(i) == 'z' && (i + 2 < str.length()) && str.charAt(i + 2) == 'p') {
            result.append("zp"); // Replace 'zip' or 'zap' with 'zp'
            i += 2; // Skip the next two characters ('i' or 'a') as well
        } else {
            result.append(str.charAt(i)); // Keep other characters as they are
        }
    }

    return result.toString();
}
     */
}
