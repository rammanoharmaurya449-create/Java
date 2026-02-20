import java.util.ArrayList;

class Employee {
    private String empId;
    private String name;
    private double basicSalary;
    private double deductions;

    public Employee(String empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.deductions = 0;
    }

    public String getEmpId() {
        return empId;
    }

    public void applyDeduction(double amount) {
        if (amount > 0) {
            deductions += amount;
        }
    }

    public double calculateNetSalary() {
        return basicSalary - deductions;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Deductions: $" + deductions);
        System.out.println("Net Salary: $" + calculateNetSalary());
        System.out.println();
    }
}

class Payroll {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployee(String empId) {
        for (Employee emp : employees) {
            if (emp.getEmpId().equals(empId)) {
                return emp;
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        Employee e1 = new Employee("E101", "Ram Manohar Maurya", 50000);
        Employee e2 = new Employee("E102", "Anjana Maurya", 60000);

        payroll.addEmployee(e1);
        payroll.addEmployee(e2);

        e1.applyDeduction(5000);
        e2.applyDeduction(8000);

        payroll.displayAllEmployees();
    }
}
 