package String3;

public class withoutString {

    public static void main (String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));

    }
    public static String withoutString(String base, String remove) {

        StringBuilder sb = new StringBuilder();
        int baseLen = base.length();
        int removeLen = remove.length();

        for (int i = 0; i < baseLen; i++) {
            //Set i <= baseLen - removeLen && to avoid IndexOutOfBound exception
            if (i <= baseLen - removeLen &&
                    //check is remove in base
                    //using equalsIgnoreCase() to ignore case difference
                    base.substring(i, i + removeLen).equalsIgnoreCase(remove)) {
                //match is found , we increment i by removeLen - 1 to skip over the matched substring
                i += removeLen - 1;
            } else {
                sb.append(base.charAt(i));
            }
        }

        return sb.toString();
    }

}
