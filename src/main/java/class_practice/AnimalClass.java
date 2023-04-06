package class_practice;

import sun.management.Agent;

public class AnimalClass {
    private int age;
    private String gender;
    private double weight;
    private String animalType;

    public AnimalClass(int age, String gender, double weight,
                       String animalType) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.animalType = animalType;
    }
    public void sleep(){
        System.out.println("Sleeping zzz...");
    }
    public void eat(String animalType){
        switch (animalType){
            case "Carnivore":
                System.out.println("love to eat meat");
                break;
            case "Herbivore":
                System.out.println("loves veggies");
                break;
            case "Omnivore":
                System.out.println("loves meat and veggies");
                break;
                default:
                    System.out.println("Africa is the future");
            break;
        }
    }
}
