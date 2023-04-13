package employee_app.com.hr.personnel;

import employee_app.Employee;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
        private int hoursWorkedPerMonth;
        private double hourlyRate;

        public HourlyEmployee(String firstName, String lastName,
                              String employeeId, int hoursWorkedPerMonth,
                              double hourlyRate, LocalDate hireDate) {
            super(firstName, lastName, employeeId,hireDate);
            this.hoursWorkedPerMonth = hoursWorkedPerMonth;
            this.hourlyRate = hourlyRate;
        }


        // Accessor method to get hoursWorkedPerMonth
        public int getHoursWorkedPerMonth() {
            return hoursWorkedPerMonth;
        }

        // Accessor method to set hoursWorkedPerMonth
        public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
            this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        }

        // Accessor method to get hourlyRate
        public double getHourlyRate() {
            return hourlyRate;
        }

        // Accessor method to set hourlyRate
        public void setHourlyRate(double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }

    // Override computeMonthlyCompensation() method from parent Employee class
    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }
}


