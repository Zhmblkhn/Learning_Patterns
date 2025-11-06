package FactoryPattern.Animals;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new CatFactory();
        Animal cat = animalFactory.createAnimal();
        cat.speak();

        AnimalFactory animalFactory1 = new DogFactory();
        Animal dog = animalFactory1.createAnimal();
        dog.speak();
    }
}
