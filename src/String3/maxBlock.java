package String3;

public class maxBlock {

    public static void main (String[] args) {
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
    }

    public static int maxBlock(String str) {
        int tempCount = 0;
        int count = 0;
        if (str.length() == 0) return 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                tempCount++;
            } else {
                tempCount = 0;
            }

            if (tempCount > count) count = tempCount;

        }
        // Add 1 to account for the first character in the block
        return count + 1;
    }

}
