package Array2;

public class matchUp {

    public static void main (String[] args) {
        int[] nums1 = {1 , 2 , 3};
        int[] nums2 = {2 , 3 , 10};

        int[] secNums1 = {1 , 2 , 3};
        int[] secNums2 = {2 , 3 , 5};

        int[] thirdNums1 = {1 , 2 , 3};
        int[] thirdNums2 = {2 , 3 , 3};

        System.out.println(matchUp(nums1 , nums2));
        System.out.println(matchUp(secNums1 , secNums2));
        System.out.println(matchUp(thirdNums1 , thirdNums2));

    }

    public static int matchUp(int[] nums1, int[] nums2) {

        //two elements differ by 2 or less
        //Math.abs(nums1[i] - nums2[i]) <= 2

        //they can't be equal
        //nums1[i] != nums2[i]

        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                count++;
            }
        }
        return count;
    }
}
