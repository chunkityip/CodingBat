package Array2;

import java.util.Arrays;

public class tenRun {

    public static void main (String[] args) {
        int[] num = {2, 10, 3, 4, 20, 5};

        System.out.println(Arrays.toString(tenRun(num)));
    }

    public static int[] tenRun(int[] nums) {

        boolean find10 = false;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                temp = nums[i];
                find10 = true;
            } else if (nums[i] % 10 != 0 && find10) {
                nums[i] = temp;
            }
        }

        return nums;
    }
}
