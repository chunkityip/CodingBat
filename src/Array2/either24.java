package Array2;

public class either24 {

    public static void main (String[] args) {
        int[] num = {1 , 2 , 2};
        int[] num1 = {4 , 4 , 1};
        int[] num2 = {4 , 4 , 1 , 2 , 2};


        System.out.println(either24(num));
        System.out.println(either24(num1));
        System.out.println(either24(num2));
    }

    public static boolean either24(int[] nums) {

        boolean match2 = false;
        boolean match4 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) match2 = true;
            if (nums[i] == 4 && nums[i + 1] == 4) match4 = true;
        }

        return match2 != match4;
    }

}
