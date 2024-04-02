package String2;

public class catDog {

    public static void main (String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
    }

    public static boolean catDog(String str) {

        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if ("cat".equals(str.substring(i , i + 3))) catCount++;
            if ("dog".equals(str.substring(i , i + 3))) dogCount++;
        }

        return catCount == dogCount;
    }
}
