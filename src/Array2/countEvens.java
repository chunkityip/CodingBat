package Array2;

public class countEvens {

    public static void main (String[] args) {
        int[] nums = {2, 1, 2, 3, 4}; // Create an integer array
        System.out.println(countEvens(nums)); // Call the countEvens method with the array as an argument

        int[] nums1 = {2, 2, 0}; // Create an integer array
        System.out.println(countEvens(nums1)); // Call the countEvens method with the array as an argument

        int[] nums2 = {1 , 3 , 5}; // Create an integer array
        System.out.println(countEvens(nums2)); // Call the countEvens method with the array as an argument

    }

    public static int countEvens(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) even++;
        }
        return even;
    }
}
