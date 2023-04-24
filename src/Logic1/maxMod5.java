package Logic1;

public class maxMod5 {

    public static void main (String[] args) {
        System.out.println(maxMod5(2, 3));
        System.out.println(maxMod5(6, 2));
        System.out.println(maxMod5(3, 2));
    }

    public static int maxMod5(int a, int b) {

      /*
      1. return which one is bigger using Math.max()
      2. !!But , if a % 5 == b % 5 , return smallest one using Math.min();
      3. if (a == b) return 0;
      */

        if (a == b) return 0;
        if (a % 5 == b % 5) return Math.min(a , b);

        return Math.max(a , b);
    }
}
