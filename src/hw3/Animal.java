package hw3;

public class Animal {
    private final String name;
    private static int animalCounter = 0;

    Animal(String name){
        this.name = name;
        animalCounter++;
    }
    void run(int distance){
        System.out.println(name + " run " + distance + " m.");
    }

    void swim(int distance){
        System.out.println(name + " swam " + distance + " m.");
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    public String getName() {
        return name;
    }
}
