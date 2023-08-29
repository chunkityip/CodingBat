package Array2;

public class has22 {

    public static void main (String[] args) {
        int[] num = {1 , 2 , 2};
        System.out.println(has22(num));

        int[] num1 = {1 , 2 , 1 , 2};
        System.out.println(has22(num1));

        int[] num2 = {2, 1 ,2};
        System.out.println(has22(num2));
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) return true;
        }
        return false;
    }

}
