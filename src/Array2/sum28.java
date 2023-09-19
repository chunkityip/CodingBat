package Array2;

public class sum28 {

    public static void main (String[] args) {
        int[] num = {2, 3, 2, 2, 4, 2};
        int[] num1 = {2, 3, 2, 2, 4, 2, 2};
        int[] num2 = {1, 2, 3, 4};

        System.out.println(sum28(num));
        System.out.println(sum28(num1));
        System.out.println(sum28(num2));
    }

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
            continue;
        }

        return (sum == 8);
    }
}
