import java.util.*;

public class Employee{
  Scanner input = new Scanner(System.in); 

  private int id;
  private double salary;

  public Employee(){
    id = 0;
    salary = 0.0;
  }
  public Employee(int i, double s){
    id = i;
    salary = s;
  }
  public Employee(int i){
    id = i;
    salary = 0.0;
  }
  public Employee(double s){
    id = 0;
    salary = s;
  }

  public void setId(int i){
    id = i;
  }
  public int getId(){
    return id;
  }

  public void setSalary(double s){
    salary = s;
  }
  public double getSalary(){return salary;}

  public void setdata(){
    System.out.println("Please Enter ID and Salary: ");
    id = input.nextInt();
    salary = input.nextDouble();
  }
  public void displayData() {
        System.out.println("Employee ID: " + id + ", Salary: " + salary);
  }
}
