package Array2;

public class no14 {

    public static void main (String[] args) {
        int[] num = {1 ,2 ,3};
        int[] num1 = {1 , 2 , 3 ,4};
        int[] num2 = {2 , 3 , 4};

        System.out.println(no14(num));
        System.out.println(no14(num1));
        System.out.println(no14(num2));
    }

    public static boolean no14(int[] nums) {
        boolean hasOne = false;
        boolean hasFour = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) hasOne = true;
            if (nums[i] == 4) hasFour = true;
        }
        return !hasOne || !hasFour;
    }
}
