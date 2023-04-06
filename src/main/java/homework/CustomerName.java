package homework;

public class CustomerName {

        private String firstName;
        private String middleName;
        private String lastName;

        // Constructor
        public CustomerName(String firstName, String middleName,
                            String lastName) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
        }

        // Getter methods
        public String getFirstName() {
            return firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public String getLastName() {
            return lastName;
        }

        // Setter methods
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void getFullName(){
            System.out.println("Customer Name: " + firstName + " " + middleName
            + " " + lastName );
        }
    }

