package String2;

public class getSandwich {

    public static void main (String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println("xxbreadyy");
    }

    public static String getSandwich(String str) {

        //Check the first index of bread
        int firstBread = str.indexOf("bread");
        //Check the last index of bread
        int lastBread = str.lastIndexOf("bread");

        //the reason of -1 is index start with 0
        //the reason of firstBread != lastBread is to make sure we are not looking at same index
        if (firstBread != -1 && lastBread != -1 && firstBread != lastBread) {
            return str.substring(firstBread + 5 , lastBread);
        }

        return "";
    }
}
