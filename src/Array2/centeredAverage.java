package Array2;

import java.util.Arrays;

public class centeredAverage {

    public static void main (String [] args) {
        int[] nums = {1, 2, 3, 4, 100};
        System.out.println(enteredAverage(nums));

        int[] nums1 = {1, 1, 5, 5, 10, 8, 7};
        System.out.println(enteredAverage(nums1));

        int[] nums2 = {-10, -4, -2, -4, -2, 0};
        System.out.println(enteredAverage(nums2));

    }

    public static int enteredAverage(int[] nums) {
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            //Since it is sorted , the first one will be smallest and last one will be largest
            return(nums[nums.length/2 - 1] + nums[nums.length/2]) / 2;
        }

        return nums[nums.length/2];
    }
    /*
    Without using Arrays.sort
    public static int enteredAverage(int[] nums) {

    int sum = 0;
    int min = nums[0];
    int max = nums[0];

    for(int i = 0; i < nums.length; i++) {
        sum += nums[i];
        min = Math.min(min, nums[i]);
        max = Math.max(max, nums[i]);
    }

    return (sum - max - min) / (nums.length - 2);
    }
     */
}
