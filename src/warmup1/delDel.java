package warmup1;

public class delDel {
    /*
        Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"
     */
    public static void main (String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }

    public static String delDel(String str) {
        //if the position of "del" is index 1
        if (str.indexOf("del" , 1) == 1) {
            //replace the del to nothing
            return str.replaceFirst("del" , "");
        }
        return str;
    }
}
