import java.util.*;

public class Date{
  private int day;
  private int month;
  private int year;

  // Constructors
  public Date(){
    day = 1;
    month = 1;
    year = 2000;
  }
  public Date(int d, int m, int y){
    day = d;
    month = m;
    year = y;
  }

  // Setter & Getter
  public void setDay(int d){
    day = d;
  }
  public void setMonth(int m){
    month = m;
  }
  public void setYear(int y){
    year = y;
  }
  public int setDay(){return day;}
  public int setMonth(){return month;}
  public int setYear(){return year;}

  public void getDate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date in format (MM/DD/YY or MM/DD/YYYY): ");
        String dateStr = input.nextLine();

        String[] parts = dateStr.split("/");
        if (parts.length == 3) {
            this.month = Integer.parseInt(parts[0].trim());
            this.day = Integer.parseInt(parts[1].trim());
            this.year = Integer.parseInt(parts[2].trim());
        } else {
            System.out.println("Invalid format!");
        }
    }

  // Printing
  public void showDate(){
    System.out.println("Date: " + month + "/" + day + "/" + year);
  }
}
