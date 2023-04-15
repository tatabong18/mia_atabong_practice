package employee_app.com.hr.personnel;

import employee_app.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    //private Employee[] employees =  new Employee[100];
    List<Employee> employees = new ArrayList<Employee>();
   // private int currentIndex = 0;
    private int nextAvailableSlotOfEmployeeArray;
    private int numberOfEmployeesWhoWorked;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
       // currentIndex = 0;
    }

    // Method to add an Employee object to the array
    public void addEmployee(Employee employee) {
//        if (currentIndex < employees.length) {
//            employees[currentIndex++] = employee;
//        } else {
//            System.out.println("Maximum number of employees reached.");
//        }
        this.employees.add(employee);

    }

    // Method to retrieve an Employee object from the array
    public Employee getEmployee(int index) {
//        if (index >= 0 && index < currentIndex) {
//            return employees[index];
//        } else {
//            System.out.println("Invalid index.");
//            return null;
//        }
        return this.employees.get(index);
    }

    // Method to retrieve the number of employees in the department
    public int getNumEmployees() {
        return this.employees.size();
    }

    // Getter methods for name and location fields
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    // Method to let employees work and return the number of employees who worked
    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numEmployeesWorked = 0;
        for (int i = 0;  i < this.employees.size(); i++)
            if (employees.get(i).work().contains("worked")) {
                numberOfEmployeesWhoWorked++;
            }
        return numEmployeesWorked;
    }
    // Method to compute total monthly compensation of all employees in that department
    public double computeDepartmentMonthlyTotalCompensation() {
        double totalCompensation = 0.0;
        for (int i = 0; i < this.employees.size(); i++) {
            totalCompensation += employees.get(i).computeMonthlyCompensation();
        }
        return totalCompensation;
    }
}
