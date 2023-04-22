package Logic1;

public class fizzString {

    public static void main (String [] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }

    public static String fizzString(String str) {

        boolean front = str.startsWith("f");
        boolean back = str.endsWith("b");

        if(front && back) return "FizzBuzz";
        if(front) return "Fizz";
        if(back) return "Buzz";

        return str;
    }
}
