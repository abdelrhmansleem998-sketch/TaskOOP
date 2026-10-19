import java.util.*;

public class SumTwoNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double n1 = input.nextDouble();

    System.out.print("Enter second number: ");
    double n2 = input.nextDouble();

    double sum = n1 + n2;
    System.out.println("Sum = " + sum);

    input.close();
  }
}
