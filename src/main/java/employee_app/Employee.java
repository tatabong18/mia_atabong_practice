package employee_app;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hireDate;
    private LocalDate currentDate = LocalDate.now();

    public Employee(String firstName, String lastName, String employeeId) {

    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public int computeNumberOfYearsWorkedSinceHired() {
        return (currentDate.getYear() - hireDate.getYear());
    }
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getEmployeeInfo() {
return ("name = " + name + "; hireDate = " + hireDate);
    }
    public String work() {
        return ("Mike worked");
    }

}
