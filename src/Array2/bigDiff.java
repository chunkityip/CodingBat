package Array2;

public class bigDiff {

    public static void main (String [] args) {
        int[] num = {10, 3, 5, 6};
        System.out.println(bigDiff(num));

        int[] num1 = {7, 2, 10, 9};
        System.out.println(bigDiff(num1));

        int[] num2 = {2, 10, 7, 2};
        System.out.println(bigDiff(num2));


    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
        }

        return max - min;
    }
}
