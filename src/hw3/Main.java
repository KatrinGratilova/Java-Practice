package hw3;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Honey");

        animal1.swim(120);
        animal1.run(10);
        System.out.println(" ");

        Cat cat1 = new Cat("Gray");
        Cat cat2 = new Cat("Tom");
        Animal cat3 = new Cat("Anfice");  // upcasting

        cat1.run(120);
        cat1.swim(100);
        cat2.run(220);
        cat3.swim(100);
        System.out.println(" ");

        Dog dog1 = new Dog("Bobik");
        Animal dog2 = new Dog("Lord");  // upcasting
        Dog dog3 = (Dog) dog2;  // down casting

        dog1.run(500);
        dog1.swim(12);
        dog1.voice();

        dog2.run(501);
        //dog2.voice();

        dog3.voice();

        System.out.println("\nDog count: " + Dog.getDogCounter());
        System.out.println("Cat count: " + Cat.getCatCounter());
        System.out.println("Animal count: " + Animal.getAnimalCounter());
    }
}