package String1;

public class withoutX2 {

    /*
    Given a string, if one or both of the first 2 chars is 'x',
    return the string without those 'x' chars, and otherwise return
    the string unchanged. This is a little harder than it looks.


        withoutX2("xHi") → "Hi"
        withoutX2("Hxi") → "Hi"
        withoutX2("Hi") → "Hi"
     */

    public static void main (String [] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }

    public static String withoutX2(String str) {
        if (str.length() == 0 || str.length() == 1 && str.charAt(0) == 'x' ) return "";

  /*
  Three situation :
  One : Index 0 and Index 1 are both 'x' , then display starting from index2
  Two : Index 0 is 'x' , then display starting from index 1
  Three Index 1 is 'x' , then display index 0 + starting from index2
  */

        if (str.charAt(0) == 'x' && str.charAt(1) == 'x') return str.substring(2);
        if (str.charAt(0) == 'x') return str.substring(1);
        if (str.charAt(1) == 'x') return str.substring(0 , 1) + str.substring(2);

        return str;
    }
}
