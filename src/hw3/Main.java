package hw3;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Honey");

        animal1.swim(600);
        animal1.run(100);
        System.out.println(" ");

        Cat catGray = new Cat("Gray");
        Cat catTom = new Cat("Tom");
        Animal catAnfice = new Cat("Anfice");  // upcasting

        catGray.run(12.5);
        catGray.swim(1);
        catTom.run(230);
        catAnfice.swim(100);
        System.out.println(" ");

        Dog dogBobik = new Dog("Bobik");
        Animal dogLord = new Dog("Lord");  // upcasting

        // example of right down casting
        if(dogLord instanceof Dog){
            Dog dog3 = (Dog) dogLord;
            dog3.swim(4.5);
            dog3.voice();
        }

        dogBobik.run(500);
        dogBobik.swim(12);
        dogBobik.voice();

        dogLord.run(501.7);
        //dogLord.voice();  error - we cannot call methods created in the class Dog

        System.out.println("\nDog count: " + Dog.getDogCounter());
        System.out.println("Cat count: " + Cat.getCatCounter());
        System.out.println("Animal count: " + Animal.getAnimalCounter());
    }
}