//package employee_app.com.hr.personnel;
//
//import employee_app.Employee;
//
//public class Department {
//        private String departmentName;
//        private Employee[] employees;
//
//        public Department(String departmentName, int numEmployees) {
//            this.departmentName = departmentName;
//            employees = new Employee[numEmployees];
//        }
//
//        // Method to add an Employee object to the array
//        public void addEmployee(Employee employee, int index) {
//            if (index >= 0 && index < employees.length) {
//                employees[index] = employee;
//            } else {
//                System.out.println("Invalid index.");
//            }
//        }
//
//        // Method to retrieve an Employee object from the array
//        public Employee getEmployee(int index) {
//            if (index >= 0 && index < employees.length) {
//                return employees[index];
//            } else {
//                System.out.println("Invalid index.");
//                return null;
//            }
//        }
//
//        // Method to retrieve the number of employees in the department
//        public int getNumEmployees() {
//            return employees.length;
//        }
//    }
//
//

package employee_app.com.hr.personnel;
//
//import employee_app.Employee;
//
//import employee_app.Employee;
//
//public class Department {
//    private String name;
//    private String location;
//    private Employee[] employees;
//    private int currentIndex;
//
//    public Department(String name, String location) {
//        this.name = name;
//        this.location = location;
//        employees = new Employee[100];
//        currentIndex = 0;
//    }
//
//    // Method to add an Employee object to the array
//    public void addEmployee(Employee employee) {
//        if (currentIndex < employees.length) {
//            employees[currentIndex] = employee;
//            currentIndex++;
//        } else {
//            System.out.println("Maximum number of employees reached.");
//        }
//    }
//
//    // Method to retrieve an Employee object from the array
//    public Employee getEmployee(int index) {
//        if (index >= 0 && index < currentIndex) {
//            return employees[index];
//        } else {
//            System.out.println("Invalid index.");
//            return null;
//        }
//    }
//
//    // Method to retrieve the number of employees in the department
//    public int getNumEmployees() {
//        return currentIndex;
//    }
//
//    // Getter methods for name and location fields
//    public String getName() {
//        return name;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//}

import employee_app.Employee;

public class Department {
    private String name;
    private String location;
    private Employee[] employees;
    private int currentIndex;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        employees = new Employee[100];
        currentIndex = 0;
    }

    // Method to add an Employee object to the array
    public void addEmployee(Employee employee) {
        if (currentIndex < employees.length) {
            employees[currentIndex] = employee;
            currentIndex++;
        } else {
            System.out.println("Maximum number of employees reached.");
        }
    }

    // Method to retrieve an Employee object from the array
    public Employee getEmployee(int index) {
        if (index >= 0 && index < currentIndex) {
            return employees[index];
        } else {
            System.out.println("Invalid index.");
            return null;
        }
    }

    // Method to retrieve the number of employees in the department
    public int getNumEmployees() {
        return currentIndex;
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
        for (int i = 0; i < currentIndex; i++) {
            String workResult = employees[i].work();
            if (workResult.contains("worked")) {
                numEmployeesWorked++;
            }
        }
        return numEmployeesWorked;
    }
}
