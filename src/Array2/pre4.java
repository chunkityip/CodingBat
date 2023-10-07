package Array2;

import java.util.Arrays;

public class pre4 {

    public static void main (String [] args) {
        int[] nums = {1 , 2 , 4 , 1};
        System.out.println(Arrays.toString(pre4(nums)));
    }

    public static int[] pre4(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) break;
            count++;
        }

        int[] ans = new int[count];

        for (int i = 0; i <count; i++) {
            ans[i] = nums[i];
        }
        return ans;
    }
}
