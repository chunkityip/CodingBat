package Logic1;

public class caughtSpeeding {

    public static void main (String[] args) {
        System.out.println(caughtSpeeding(60 , false));
        System.out.println(caughtSpeeding(65 , false));
        System.out.println(caughtSpeeding(65 , true));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
      /*

      speed <= 60 , return 0
      speed >= 61 && speed <= 80 return 1
      speed >= 81 , return 2

      isBirthday type , is (isBirthday) , speed -= 5

      if (isBirthday) speed -= 5

      speed <= 60 , return 0
      speed >= 61 && speed <= 80 return 1
      speed >= 81 , return 2

      */
        if (isBirthday) speed -= 5;
        if (speed <= 60) return 0;
        if (speed >= 61 && speed <= 80) return 1;

        return 2;
    }
}
