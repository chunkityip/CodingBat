package warmup2;

public class arrayFront9 {

    public static void main (String[] args) {
        int[] nums1 = new int[] {1 , 2 , 9 , 3 ,4};
        System.out.println(arrayFront9(nums1));

        int[] nums2 = new int[] {1, 2, 3, 4, 9};
        System.out.println(arrayFront9(nums2));

        int[] nums3 = new int[] {1, 2, 3, 4, 5};
        System.out.println(arrayFront9(nums3));
    }

    public static boolean arrayFront9(int[] nums) {
        int length = nums.length;
        //Because we only count the first 4 length , so set the length to 4 if length > 4
        if (length > 4) length = 4;

        for (int i = 0; i < length; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
}
