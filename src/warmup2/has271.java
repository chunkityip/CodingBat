package warmup2;

public class has271 {

    /*

    Given an array of ints, return true if it contains
    a 2, 7, 1 pattern: a value, followed by the value plus 5,
    followed by the value minus 1. Additionally the 271 counts
    even if the "1" differs by 2 or less from the correct value.

        has271([1, 2, 7, 1]) → true
        has271([1, 2, 8, 1]) → false
        has271([2, 7, 1]) → true
     */

    public static void main (String[] args) {

        int[] num1 = new int[] {1 , 2 ,7 ,1};
        System.out.println(num1);

        int[] num2 = new int[] {1 ,2 ,8 ,1};
        System.out.println(num2);

        int[] num3 = new int[] {2 ,7 ,1};
        System.out.println(num3);
    }

    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int value = nums[i];
            if  ( (nums[i + 1]  == value + 5) &&
                    Math.abs(nums[i + 2] - (value - 1)) <= 2)  {
                return true;
            }
        }
        return false;
    }

}
