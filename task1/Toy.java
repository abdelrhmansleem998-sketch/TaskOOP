import java.util.*;

public class Toy {
  Scanner input = new Scanner(System.in);

  public String name;
  public double price;

  public Toy() {
    this.name = "";
    this.price = 0.0;
  }

  public void Display() {
    System.out.println("Name: " + name);
    System.out.println("Price: " + price);
  }

  public void setDetails() {
    this.name = "Bear";
    this.price = 100.0;
  }

  public void inputDetails() {
    System.out.print("Enter name: ");
    this.name = input.nextLine();
    System.out.print("Enter price: ");
    this.price = input.nextDouble();
    input.nextLine();
  }

  public void inputName(String name) {
    this.name = name;
  }

  public void inputPrice(double price) {
    this.price = price;
  }

  public void checkPrice() {
    if (price > 1000.0) {
      System.out.println("Please Enter Number less than 1000.");
      double newPrice = input.nextDouble();
      input.nextLine();
      inputPrice(newPrice);
    }
  }
}
