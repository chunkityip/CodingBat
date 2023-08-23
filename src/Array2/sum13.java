package Array2;

public class sum13 {
    public static void main (String[] args) {
        int[] num = {1, 2, 2, 1};
        int[] num1 = {1, 1};
        int[] num2 = {1, 2, 2, 1 , 13};

        System.out.println(sum13(num));
        System.out.println(sum13(num1));
        System.out.println(sum13(num2));
    }

    public static int sum13(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }
}
