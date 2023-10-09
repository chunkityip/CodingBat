package Array2;

import java.util.Arrays;

public class notAlone {

    public static void main (String[] args) {
        int[] nums = {1 , 2 , 3};
        int val = 2;
        System.out.println(Arrays.toString(notAlone(nums , val)));
    }

    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i - 1] != nums[i] && nums[i + 1] != nums[i]) {
                nums[i] = Math.max(nums[i - 1] , nums[i + 1]);
            }
        }
        return nums;
    }
}
