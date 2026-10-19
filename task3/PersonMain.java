import java.util.*;

public class PersonMain {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Person p1 = new Person();

    System.out.print("Enter age: ");
    p1.age = input.nextInt();

    p1.sayAge();
    p1.sayHello();

    input.close();
  }
}
