public class RectangleMain {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();

    r1.inputDetails();
    r1.checkValues();

    if (r1.isValid()) {
      r1.Display();
      System.out.println("Perimeter: " + r1.Perimeter());
      System.out.println("Area: " + r1.Area());
    }

    Rectangle.closeInput();
  }
}
