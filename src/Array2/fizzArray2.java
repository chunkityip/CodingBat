package Array2;

public class fizzArray2 {

    public static void main (String[] args) {

        System.out.println(fizzArray2(4));
        System.out.println(fizzArray2(10));
        System.out.println(fizzArray2(2));
    }

    public static String[] fizzArray2(int n) {
        String[] num = new String[n];

        for(int i = 0; i < n; i++) {
            num [i] = String.valueOf(i);
        }

        return num;
    }
}
