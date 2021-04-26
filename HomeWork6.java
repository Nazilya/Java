package Homework6;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", "White",300, 0);
        Animal dog = new Dog("Sharik", "black", 700, 15);
        animalGame(cat);
        animalGame(dog);
    }

    public static void animalGame(Animal animal) {
        animal.info();
        animal.jump();
        animal.run();
        animal.sweem();

    }
}
