package Logic1;

public class shareDigit {

    public static void main (String[] args) {
        System.out.println(shareDigit(12, 23));
        System.out.println(shareDigit(12, 43));
        System.out.println(shareDigit(12, 44));
    }

    public static boolean shareDigit(int a, int b) {
        int frontA = a / 10;
        int frontB = b / 10;

        int backA = a % 10;
        int backB = b % 10;

        //     "1"2      "2"3       "1"2     2"3
        return frontA == frontB || frontA == backB ||
                backA == frontB || backA == backB;
        //     1"2"     "2"3        1"2"    2"3"
    }
}
