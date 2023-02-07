package warmup2;

public class array123 {

    public static void main (String[] args) {
        int[] nums1 = new int[]{1 , 1 , 2 , 3 ,1};
        System.out.println(array123(nums1));

        int[] nums2 = new int[]{1, 1, 2, 4, 1};
        System.out.println(array123(nums2));

        int[] nums3 = new int[] {1, 1, 2, 1, 2, 3};
        System.out.println(array123(nums3));
    }

    public static boolean array123(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }
}
