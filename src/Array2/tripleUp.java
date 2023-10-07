package Array2;

public class tripleUp {

    public static void main (String[] args) {
        int[] num = {1, 4, 5, 6, 2};
        int[] num1 = {1 , 2 , 3};
        int[] num2 = {1 , 2 , 4};

        System.out.println(tripleUp(num));
        System.out.println(tripleUp(num1));
        System.out.println(tripleUp(num2));
    }

    public static boolean tripleUp(int[] nums) {
        if (nums.length < 3) return false;

        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
                return true;
            }
        }
        return false;
    }
}
