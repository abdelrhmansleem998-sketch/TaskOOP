public class Main {
  public static void main(String[] args) {
    Student st1 = new Student();

    st1.setDetails();
    st1.Display();

    st1.inputDetails();
    st1.Display();

    st1.inputAge();
    st1.Display();

    st1.computeAge();
    st1.checkAge();
    st1.hasPassed();

    Student.closeInput();
  }
}
