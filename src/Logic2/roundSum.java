package Logic2;

public class roundSum {

    public static void main (String[] args) {
        System.out.println(roundSum(16 , 17 , 18));
        System.out.println(roundSum(12 , 13 , 14));
        System.out.println(roundSum(6 , 4 , 4));
    }

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

// if the last digit is bigger then or equal to 5 , value up to multiple of 10
// if the last digit is smaller then 5 , value down to multiple of 10

    public static int round10(int n) {
        //if n <= 4 , return 0
        if (n <= 4) return 0;

        int lastD = n % 10;
        //First , we need to know is n's last digit bigger or equals to 5
        if (lastD >= 5) {
            return n + 10 - lastD;
        }
        return n - lastD;
    }
}
