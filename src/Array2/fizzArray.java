package Array2;

public class fizzArray {

    public static void main (String[] args) {
        System.out.println(fizzArray(4));
        System.out.println(fizzArray(1));
        System.out.println(fizzArray(10));
    }

    public static int[] fizzArray(int n) {
        int[] num = new int[n];

        for (int i = 0; i < n; i ++) {
            num[i] += i;
        }

        return num;
    }
}
