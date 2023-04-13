package employee_app;

import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;

    private LocalDate hireDate;
    private LocalDate currentDate = LocalDate.now();
    private String employeeId;

    public Employee() {

    }
//    public Employee(String firstName, LocalDate hireDate) {
//        this.firstName = firstName;
//        this.hireDate = hireDate;
//    }

    public Employee(String firstName, String lastName,
                    String employeeId, LocalDate hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.hireDate = hireDate;

    }



    public String getName() {
        return firstName;

    }

    public int computeNumberOfYearsWorkedSinceHired() {
        return (currentDate.getYear() - hireDate.getYear());
    }


    public String getEmployeeInfo() {
return ("name = " + firstName + "; hireDate = " + hireDate);
    }
    public String work() {
        return ("Mike worked");
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
