package String3;

public class countYZ {

    public static void main (String[] args) {
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
    }

    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 1; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i)) &&
                    (str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'z')) {
                count++;
            }
        }

        if (str.endsWith("y") || str.endsWith("z")) {
            count++;
        }

        return count;
    }
}
