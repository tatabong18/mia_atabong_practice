package class_practice;

public class Staticmethod {

//Create a static method
//Take an argument and displays the value of that argument
//Includes an instance method

    public class Person {
        private String name;
        private int age;
        private String address;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void sayHello() {
            System.out.println("Hello, my name is " + this.name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}