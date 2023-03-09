package Warmup2;

public class array667 {
    /*

        Given an array of ints, return the number of times that two 6's are next to each other in the array.
        Also count instances where the second "6" is actually a 7.


        array667([6, 6, 2]) → 1
        array667([6, 6, 2, 6]) → 1
        array667([6, 7, 2, 6]) → 1

     */

    public static void main (String[] args) {
        int[] num1 = new int[]{6, 6, 2};
        System.out.println(array667(num1));

        int[] num2 = new int[]{6, 6, 2, 6};
        System.out.println(array667(num2));

        int[] num3 = new int[]{6, 7, 2, 6};
        System.out.println(array667(num3));
    }

    public static int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && nums[i + 1] == 6 || nums[i + 1] == 7) {
                count++;
            }
        }
        return count;
    }

}
