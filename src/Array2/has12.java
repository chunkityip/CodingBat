package Array2;

public class has12 {

    public static void main (String[] args) {
        int[] num = {1 , 3 , 2};
        int[] num1 = {3 , 1 , 2};
        int[] num2 = {3 , 1 , 4 , 5 , 2};

        System.out.println(has12(num));
        System.out.println(has12(num1));
        System.out.println(has12(num2));
    }

    public static boolean has12(int[] nums) {
        boolean hasOne = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) hasOne = true;
            if (hasOne && nums[i] == 2) return true;
        }

        return false;
    }
}
