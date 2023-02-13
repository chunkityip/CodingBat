package warmup2;

public class noTriples {
    /*
    Given an array of ints, we'll say that a triple is a value appearing
    3 times in a row in the array. Return true if the array does not
    contain any triples.


        noTriples([1, 1, 2, 2, 1]) → true
        noTriples([1, 1, 2, 2, 2, 1]) → false
        noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */
    public static void main (String[] args) {
        int[] nums1 = new int[]{1, 1 , 2 , 2 ,1};
        System.out.println(nums1);

        int[] nums2 = new int[]{1, 1, 2, 2, 2, 1};
        System.out.println(nums2);

        int[] nums3 = new int[]{1, 1, 1, 2, 2, 2, 1};
        System.out.println(nums3);
    }

    public static boolean noTriples(int[] nums) {
        //What if i is the last length , it will case indexOutOfBound , so : length - 2
        for (int i = 0; i < nums.length - 2; i++) {
            int compareNum = nums[i];
            if (nums[i + 1]  == compareNum && nums[i + 2] == compareNum) {
                return false;
            }
        }
        return true;
    }
}
