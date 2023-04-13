package employee_app.com.hr.personnel;

import employee_app.Employee;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String firstName, String lastName, String employeeId,
                            double monthlySalary, LocalDate hireDate) {
        super(firstName, lastName, employeeId, hireDate);
        this.monthlySalary = monthlySalary;
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
