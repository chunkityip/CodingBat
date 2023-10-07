package Array2;

import java.util.Arrays;

public class fizzArray3 {

    public static void main (String[] args) {
        int start = 5;
        int end = 10;
        System.out.println(Arrays.toString(fizzArray3(start , end)));
    }

    public static int[] fizzArray3(int start, int end) {
        if (start == end) return new int[0];

        int[] num = new int[end - start];
        num[0] = start;

        for (int i = 1; i < end - start; i++) {
            num[i] = num[0] + i;
        }

        return num;
    }

/*
    int n = end - start;
    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
        result[i] = start++;
    }
    return result;
*/
}
