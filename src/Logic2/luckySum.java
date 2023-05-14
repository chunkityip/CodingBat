package Logic2;

public class luckySum {

    public static void main (String[] args) {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
    }

    public static  int luckySum(int a, int b, int c) {


        //situations
        //1. if a is 13 , a , b and c are not count which return 0
        //2. if b is 13 , b, c are not count which return only a
        //3. if c is 13 , c is not couint which return a + b
        //4. else , return a + b + c

        if (a == 13) return 0;

        if (b == 13) return a;

        if (c == 13) return a + b;


        return a + b + c;


    }

}
