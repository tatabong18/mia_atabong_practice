package employee_app;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hireDate;
    private LocalDate currentDate = LocalDate.now();

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
