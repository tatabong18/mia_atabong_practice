//package employee_app.com.hr.personnel;
//
//import java.time.LocalDate;
//import java.time.Month;
//
//public class HRClient {
//    public static void main(String[] args) {
//
//        // Create two SalariedEmployee objects
//        SalariedEmployee employee1 = new SalariedEmployee("Mia",
//                LocalDate.of(2002, Month.MARCH, 13), 5000.0);
//        SalariedEmployee employee2 = new SalariedEmployee("Moses",
//                LocalDate.of(2012, Month.DECEMBER, 2), 6000.0);
//
//        // Create one HourlyEmployee object
//        HourlyEmployee employee3 = new HourlyEmployee("John",
//                LocalDate.of(2015, Month.JANUARY, 10), 120, 10.0);
//
//        System.out.println(employee1.getEmployeeInfo());
//        System.out.println(employee2.getEmployeeInfo());
//        System.out.println(employee3.getEmployeeInfo());
//
//        System.out.println("Total Working Years of " + employee1.getName() + " is " +
//                employee1.computeNumberOfYearsWorkedSinceHired() + " years");
//        System.out.println("Total Working Years of " + employee2.getName() + " is " +
//                employee2.computeNumberOfYearsWorkedSinceHired() + " years");
//        System.out.println("Total Working Years of " + employee3.getName() + " is " +
//                employee3.computeNumberOfYearsWorkedSinceHired() + " years");
//    }
//}
//

package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.time.Month;
import employee_app.Employee;

public class HRClient {
    public static void main(String[] args) {

        // Create a Department object
        Department department = new Department("HR Department",
                "New York");

        // Create two SalariedEmployee objects
        SalariedEmployee employee1 = new SalariedEmployee("Mia", "Abrams",
                "56789",100000,LocalDate.of(2002,Month.AUGUST, 07));
        SalariedEmployee employee2 = new SalariedEmployee("Nosa",
                "Okundaye", "07017",120000,LocalDate.of(2013,
                Month.APRIL, 12));

        // Create one HourlyEmployee object
        HourlyEmployee employee3 = new HourlyEmployee("John",
                "Abram", "12345",
                120, 10.0,LocalDate.of
                (2011,Month.DECEMBER, 12));
       // System.out.println(employee1.toString());
        // Add Employee objects to the Department object
       Department department1 = new Department("sales",
               "new jersey");
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department1.addEmployee(employee3);


        System.out.println(employee1.getEmployeeInfo());
        System.out.println(employee2.getEmployeeInfo());
        System.out.println(employee3.getEmployeeInfo());

//        System.out.println("Total Working Years of " +
//                employee1.getName() + " is " +
//                employee1.computeNumberOfYearsWorkedSinceHired() +
//                " years");
//        System.out.println("Total Working Years of " + employee2.getName() +
//                " is " +
//                employee2.computeNumberOfYearsWorkedSinceHired() + " years");
//        System.out.println("Total Working Years of " + employee3.getName() +
//                " is " +
//                employee3.computeNumberOfYearsWorkedSinceHired() + " years");
//
//        // Invoke letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() method
//        int numEmployeesWorked =
//                department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
//        System.out.println("Number of employees who worked: " +
//                numEmployeesWorked);
    }
}
