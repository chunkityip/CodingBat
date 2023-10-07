package Array2;

public class twoTwo {

    public static void main (String[] args) {
        int[] num = {4 , 2 , 2 , 3};
        int[] num1 = {2 , 2 , 4};
        int[] num2 = {2 , 2 , 4 , 2};


        System.out.println(twoTwo(num));
        System.out.println(twoTwo(num1));
        System.out.println(twoTwo(num2));
    }

    public static boolean twoTwo(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 2) {
                // Check if the current 2 is surrounded by another 2.
                if ((i > 0 && nums[i - 1] == 2) || (i < n - 1 && nums[i + 1] == 2)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
