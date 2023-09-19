package Array2;

public class more14 {

    public static void main (String[] args) {
        int[] num = {1, 4, 1};
        int[] num1 = {1, 4, 1, 4};
        int[] num2 = {1,1};

        System.out.println(more14(num));
        System.out.println(more14(num1));
        System.out.println(more14(num2));

    }

    public static boolean more14(int[] nums) {
        int countOne = 0;
        int countFour = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) countOne++;
            if (nums[i] == 4) countFour++;
        }

        return countOne > countFour;
    }
}
