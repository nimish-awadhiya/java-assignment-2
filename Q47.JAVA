import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public void calculateGrossSalary() {
        double grossSalary = basicSalary + (basicSalary * 0.20); // Assuming 20% of basic salary as bonus
        System.out.println("Gross Salary of " + empName + ": " + grossSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Employee employee = new Employee(empId, empName, basicSalary);
        employee.calculateGrossSalary();
        sc.close();
    }
}
