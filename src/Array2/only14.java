package Array2;

public class only14 {

    public static void main (String[] args) {
        int[] num = {1 , 4 , 1 , 4};
        int[] num1 = {1 , 4 , 2 , 4};
        int[] num2 = {1 , 1};

        System.out.println(only14(num));
        System.out.println(only14(num1));
        System.out.println(only14(num2));
    }

    public static boolean only14(int[] nums) {
        boolean is14 = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) {
                continue;
            } else {
                is14 = false;
            }
        }
        return is14;
    }
}
