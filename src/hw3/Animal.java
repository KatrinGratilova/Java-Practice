package hw3;

public class Animal {
    private final String name;
    private static int animalCounter = 0;

    Animal(String name){
        this.name = name;
        animalCounter++;
    }
    void run(double distance){
        System.out.println(name + " ran " + distance + " m.");
    }

    void swim(double distance){
        System.out.println(name + " swam " + distance + " m.");
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }
}
