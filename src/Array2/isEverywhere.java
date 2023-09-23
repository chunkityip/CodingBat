package Array2;

public class isEverywhere {

    public static void main (String[] args) {
        int[] num = {1, 2, 1, 3};
        int val = 1;

        int[] num1 = {1, 2, 1, 3};
        int val1 = 2;

        int[] num2 = {1, 2, 1, 3 , 4};
        int val2 = 1;

        System.out.println(isEverywhere(num , val));
        System.out.println(isEverywhere(num1 , val1));
        System.out.println(isEverywhere(num2 , val2));
    }

    public static boolean isEverywhere(int[] nums, int val) {
        boolean everyWhere = false;

        for (int i = 0; i < nums.length - 1 ; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }
}
