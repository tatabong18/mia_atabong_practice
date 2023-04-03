package class_practice;

public class staticmethod2 {
    public class Main {
        public static void main(String[] args) {
            Person person1 = new Person("John", 25, "123 Main St");
            Person person2 = new Person("Jane", 30, "456 Oak Ave");

            person1.setAddress("789 Elm St");
            person2.setAge(35);

            System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge() + ", " + person1.getAddress());
            System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge() + ", " + person2.getAddress());

            person1.sayHello();
            person2.sayHello();
        }
    }
    This code will output:

    csharp
    Copy code
    Person 1: John, 25, 789 Elm St
    Person 2: Jane, 35, 456 Oak Ave
    Hello, my name is John
    Hello, my name is Jane




}
