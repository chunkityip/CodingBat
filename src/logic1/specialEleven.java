package logic1;

public class specialEleven {

    public static void main (String [] args) {
        System.out.println(specialEleven(22));
        System.out.println(specialEleven(23));
        System.out.println(specialEleven(24));
    }

    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }
}
