import java.time.Year;
import java.util.*;

public class Student {
  private static final Scanner input = new Scanner(System.in);

  public String name;
  public int age;
  public int birthyear;
  public double grade;

  public Student() {
    this.name = "";
    this.age = 0;
    this.birthyear = 0;
    this.grade = 0.0;
  }

  public void Display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Birth year: " + birthyear);
    System.out.println("Grade: " + grade);
  }

  public void setDetails() {
    this.name = "Ahmed";
    this.age = 20;
    this.birthyear = Year.now().getValue() - this.age;
    this.grade = 4.0;
  }

  public void inputDetails() {
    System.out.print("Enter Name: ");
    this.name = input.nextLine();

    System.out.print("Enter Age: ");
    this.age = input.nextInt();

    System.out.print("Enter Birth year: ");
    this.birthyear = input.nextInt();

    System.out.print("Enter Grade: ");
    this.grade = input.nextDouble();
    input.nextLine();
  }

  public void inputAge() {
    System.out.print("Enter Age: ");
    this.age = input.nextInt();
    input.nextLine();
  }

  public void computeAge() {
    this.age = Year.now().getValue() - this.birthyear;
  }

  public void checkAge() {
    while (age <= 0 || age > 120) {
      System.out.println("Invalid age.");
      inputAge();
    }
  }

  public void hasPassed() {
    if (grade >= 50.0) {
      System.out.println(name + " has passed.");
    } else {
      System.out.println(name + " has failed.");
    }
  }

  public static void closeInput() {
    input.close();
  }
}
