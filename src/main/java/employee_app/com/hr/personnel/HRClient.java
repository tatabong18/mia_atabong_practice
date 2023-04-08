package employee_app.com.hr.personnel;

import employee_app.Employee;

import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.time.Month;

public class HRClient {
    public static void main(String[] args) {

        //create two employee objects
        Employee employee1 = new Employee("Mia",
                LocalDate.of(2002, Month.MARCH,13));
        Employee employee2 = new Employee("moses",
                LocalDate.of(2012,Month.DECEMBER,02));

        System.out.println(employee1.getEmployeeInfo());
        System.out.println(employee2.getEmployeeInfo());

        System.out.println("Total Working Years of " + employee1.getName() + " is " +
                employee1.computeNumberOfYearsWorkedSinceHired() + " years");
        System.out.println("Total Working Years of " + employee2.getName() + " is " +
                employee2.computeNumberOfYearsWorkedSinceHired() + " years");

    }
}
