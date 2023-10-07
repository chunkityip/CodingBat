package Array2;

public class sameEnds {

    public static void main(String[] args) {
        int[] num = {5, 6, 45, 99, 13, 5, 6};
        int len = 1;

        System.out.println(sameEnds(num , len));
    }

    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }
}
