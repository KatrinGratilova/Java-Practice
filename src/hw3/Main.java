package hw3;

public class Main {
    public static void main(String[] args) {

        Animal honey = new Animal("Honey");

        honey.swim(600);
        honey.run(100);
        System.out.println(" ");

        Cat gray = new Cat("Gray");
        Cat tom = new Cat("Tom");
        Animal anfice = new Cat("Anfice");  // upcasting

        gray.run(12.5);
        gray.swim(1);
        tom.run(230);
        anfice.swim(100);
        System.out.println(" ");

        Dog bobik = new Dog("Bobik");
        Animal lord = new Dog("Lord");  // upcasting

        // example of right down casting
        if(lord instanceof Dog){
            Dog lordCopy = (Dog) lord;
            lordCopy.swim(4.5);
            lordCopy.voice();
        }

        bobik.run(500);
        bobik.swim(12);
        bobik.voice();

        lord.run(501.7);
        //dogLord.voice();  error - we cannot call methods created in the class Dog

        System.out.println("\nDog count: " + Dog.getDogCounter());
        System.out.println("Cat count: " + Cat.getCatCounter());
        System.out.println("Animal count: " + Animal.getAnimalCounter());
    }
}