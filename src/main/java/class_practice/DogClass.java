package class_practice;

public class DogClass extends AnimalClass{
    public DogClass(int age, String gender, double weight, String animalType) {
        super(age, gender, weight, animalType);
    }

    @Override
    public void sleep() {
        System.out.println("This is overriding");
    }
}
