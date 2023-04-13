package employee_app.com.hr.personnel;

import employee_app.Employee;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String firstName, String lastName, String employeeId, double monthlySalary) {
        super(firstName, lastName, employeeId);
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String mia, LocalDate of, double v) {
        super();
    }

    // Accessor method to get monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Accessor method to set monthlySalary
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Other methods and business logic specific to SalariedEmployee class
    // ...
}
