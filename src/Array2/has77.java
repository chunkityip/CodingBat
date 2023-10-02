package Array2;

public class has77 {

    public static void main (String[] args) {
        int[] num = {1 , 7 , 7};
        int[] num1 = {1 , 7 , 1 , 7};
        int[] num2 = {1 , 7 , 1 , 1 , 7};

        System.out.println(has77(num));
        System.out.println(has77(num1));
        System.out.println(has77(num2));


    }

    public static boolean has77(int[] nums) {

        if (nums.length < 2) return false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && (nums[i + 1] == 7 || (i < nums.length - 2 && nums[i + 2] == 7))) {
                return true;
            }
        }
        return false;
    }
}
