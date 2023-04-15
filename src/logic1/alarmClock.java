package logic1;

public class alarmClock {

    public static void main(String [] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
    }

    public static String alarmClock(int day, boolean vacation) {
  /*
  Siuation:
  1. If day is between 1 and 5, but it is on vacation , return "10:00"
  2. If day is 0 or 6 and is in action , return "off"
  3. If day is between 1 and 5 , return "7:00"
  4. If it is in action , return "10:00"
  */

        if (vacation) {
            return day >= 1 && day <= 5 ? "10:00" : "off";
        }

        return day >= 1 && day <= 5 ? "7:00" : "10:00";
    }

}
