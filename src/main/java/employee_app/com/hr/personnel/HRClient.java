package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.time.Month;

public abstract class HRClient {
    public static void main(String[] args) {

        // Create a Department object
        Department department = new Department("HR Department",
                "New York");

//         Create two SalariedEmployee objects
//        SalariedEmployee employee1 = new SalariedEmployee("Mia", "Abrams",
//                "56789",100000,LocalDate.of(2002,Month.AUGUST, 07));
//        SalariedEmployee employee2 = new SalariedEmployee("Nosa",
//                "Okundaye", "07017",120000,LocalDate.of(2013,
//                Month.APRIL, 12));

        // Create one HourlyEmployee object
//        HourlyEmployee employee3 = new HourlyEmployee("John",
//                "Abram", "12345",
//                120, 33.0,LocalDate.of
//                (2011,Month.DECEMBER, 12));
       // System.out.println(employee1.toString());
        // Add Employee objects to the Department object
       Department department1 = new Department("sales",
               "new jersey");


        // Display the result of calling
        // computeDepartmentMonthlyTotalCompensation()
        // method of the Department object
        double departmentMonthlyTotalCompensation =
                department.computeDepartmentMonthlyTotalCompensation();
        System.out.println("Department Monthly Total Compensation:" +
                " $" + departmentMonthlyTotalCompensation);
    }

}

