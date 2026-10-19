import java.util.*;

public class Rectangle {
  private static final Scanner input = new Scanner(System.in);

  public double length;
  public double height;

  public Rectangle() {
    this.length = 0.0;
    this.height = 0.0;
  }

  public void inputDetails() {
    System.out.print("Enter length: ");
    this.length = input.nextDouble();

    System.out.print("Enter height: ");
    this.height = input.nextDouble();

    input.nextLine();
  }

  public void Display() {
    System.out.println("Length: " + length);
    System.out.println("Height: " + height);
  }

  public boolean isValid() {
    return length > 0 && height > 0;
  }

  public void checkValues() {
    if (!isValid()) {
      System.out.println("Invalid input");
    }
  }

  public double Perimeter() {
    return 2 * (length + height);
  }

  public double Area() {
    return length * height;
  }

  public static void closeInput() {
    input.close();
  }
}
