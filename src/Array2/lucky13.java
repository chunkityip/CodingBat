package Array2;

public class lucky13 {
    public static void main (String[] args) {
        int[] nums = {0 , 2 ,4};
        System.out.println(lucky13(nums));

        int[] nums1 = {1 , 2 ,3};
        System.out.println(lucky13(nums1));

        int[] nums2 = {1 , 2 ,4};
        System.out.println(lucky13(nums2));
    }

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 3) {
                continue;
            }
            return false;
        }
        return true;
    }

}
