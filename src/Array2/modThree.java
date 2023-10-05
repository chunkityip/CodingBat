package Array2;

public class modThree {

    public static void main (String[] args) {
        int[] num = {2, 1, 3, 5};
        int[] num1 = {2, 1, 2, 5};
        int[] num2 = {2, 4, 2, 5};

        System.out.println(modThree(num));
        System.out.println(modThree(num1));
        System.out.println(modThree(num2));
    }

    public static boolean modThree(int[] nums) {

        if (nums.length < 3) return false;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2 && nums[i + 1] % 2 == nums[i + 2] % 2) {
                return true;
            }
        }

        return false;
    }

}
