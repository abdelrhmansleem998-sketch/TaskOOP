public class Main {
    public static void main(String[] args) {
      Employee emp1 = new Employee();
        emp1.setdata(); 
        emp1.displayData();

      Employee emp2 = new Employee(101, 5500.50f);
        emp2.displayData();

      Employee emp3 = new Employee(102);
        emp3.displayData();

      emp3.setSalary(7200.0f);
        System.out.println("Updated Salary via getter: " + emp3.getSalary());
        emp3.displayData();
    }
}
