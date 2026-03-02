import java.util.Scanner;
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
class Employee {
    private String employeeName;
    private double employeeSalary;
    
  public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter employee salary: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input. Enter a numeric salary: ");
            sc.next();
        }
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}
