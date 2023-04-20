package logic1;

public class inOrder {

    public static void main (String[] args) {
        System.out.println(inOrder(1, 2, 4, false));
        System.out.println(inOrder(1, 2, 1, false));
        System.out.println(inOrder(1, 1, 2, true));
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {

        if(bOk) {
            if (c > b) return true;
        }

        return (b > a && c > b);
    }
}
