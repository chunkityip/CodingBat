package String2;

public class xyzMiddle {

    public static void main (String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        int len = str.length();

        if (len < 3) return false;

        int middleIndex = len / 2;
        //if the left or right is differ by at most one , it means the len will be odd
        boolean hasMiddle = len % 2 == 1;

        //if even , it means the balance of left and right are euqlas
        if (hasMiddle) return str.substring(middleIndex - 1, middleIndex + 2).equals("xyz");

        //right are at most one
        return str.substring(middleIndex - 2, middleIndex + 1).equals("xyz")
                //left are at most one
                || str.substring(middleIndex - 1, middleIndex + 2).equals("xyz");
    }
}
