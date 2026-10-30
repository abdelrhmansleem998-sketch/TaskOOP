public class Main {
    public static void main(String[] args) {
      Time t1 = new Time(12, 50, 50, "PM");
      Time t2 = new Time(12, 40, 40, "PM");

      t1.show();
      t2.show();

      Time totalTime = Time.sumTime(t1, t2);
      totalTime.setTimeStamp("PM");

      totalTime.show();
    }
}
