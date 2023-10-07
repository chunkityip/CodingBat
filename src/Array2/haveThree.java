package Array2;

public class haveThree {

    public static void main (String[] args) {
        int[] num = {3, 1, 3, 1, 3};
        int[] num1 = {3, 1, 3, 3};
        int[] num2 = {3, 4, 3, 3, 4};

        System.out.println(haveThree(num));
        System.out.println(haveThree(num1));
        System.out.println(haveThree(num2));
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;

        if(nums.length >= 1 && nums[0] == 3)
            count++;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] == 3 && nums[i] == 3)
                return false;

            if(nums[i] == 3)
                count++;
        }

        return count == 3;
    }

}
