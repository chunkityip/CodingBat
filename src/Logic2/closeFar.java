package Logic2;

public class closeFar {

    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(4, 1, 3));
    }

    public static boolean closeFar(int a, int b, int c) {

        // 2 situations:
        // aCase : a - b is close , a - c and b - c is far
        // bCase : a - c is close , a - b and b - c is far

        return Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2 ||
                Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
    }
}
