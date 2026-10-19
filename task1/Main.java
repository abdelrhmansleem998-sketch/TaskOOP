public class Main {
  public static void main(String[] args) {
    Toy t1 = new Toy();

    t1.setDetails();
    t1.Display();

    t1.inputDetails();
    t1.Display();

    t1.inputName("Test");
    t1.Display();

    t1.inputPrice(300.0);
    t1.checkPrice();
    t1.Display();

    t1.inputPrice(5000.0);
    t1.checkPrice();
    t1.Display();

    Toy.closeInput();
  }
}
