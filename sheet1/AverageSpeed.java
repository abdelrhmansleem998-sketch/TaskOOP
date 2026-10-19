public class AverageSpeed {
  public static void main(String[] args) {
    double miles = 24.0;
    double km = miles * 1.60934;

    int hours = 1;
    int minutes = 40;
    int seconds = 35;

    double timeInHours = hours + minutes / 60.0 + seconds / 3600.0;
    double speed = km / timeInHours;

    System.out.println("Distance = " + km + " km");
    System.out.println("Time = " + timeInHours + " hours");
    System.out.println("Average speed = " + speed + " km/h");
  }
}
