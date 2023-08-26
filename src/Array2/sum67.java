package Array2;

public class sum67 {
    public static void main (String[] args) {
        int[] num = {1 , 2,  2};
        int[] num1 = {1 , 2,  2, 6 ,99 , 99 , 7};
        int[] num2 = {1 , 1,  6 , 7 , 2};

        System.out.println(sum67(num));
        System.out.println(sum67(num1));
        System.out.println(sum67(num2));
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean stop = false;
        for (int i = 0; i < nums.length ; i++) {

            if (nums[i] == 6) stop = true;
            if (!stop) sum += nums[i];
            if (stop && nums[i] == 7) stop = false;
        }
        return sum;
    }
}
