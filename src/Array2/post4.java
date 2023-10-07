package Array2;

import java.util.Arrays;

public class post4 {

    public static void main (String[] args) {
        int[] nums = {2 , 4 , 1 , 2};
        System.out.println(Arrays.toString(post4(nums)));
    }

    public static int[] post4(int[] nums) {
        int i = nums.length - 1;

        while(nums[i] != 4)
            i--;

        int[] arr = new int[nums.length - i - 1];

        for(int j = 0; j < arr.length; j++)
            arr[j] = nums[i + j + 1];

        return arr;
    }
}
