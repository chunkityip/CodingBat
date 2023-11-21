package Warmup2;

public class countXX {
    /*
    Count the number of "xx" in the given string.
    we'll say that overlapping is allowed, so "xxx" contains 2 "xx".

       countXX("abcxx") → 1
       countXX("xxx") → 2
       countXX("xxxx") → 3
     */
    public static void main (String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ("xx".equals(str.substring(i , i + 2))) {
                count ++;
            }
        }
        return count;
    }

}
