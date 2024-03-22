package hw3;

public class Dog extends Animal{
    private static int dogCounter = 0;
    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    @Override
    void run(double distance) {
        if (distance <= 500) super.run(distance);
        else System.out.println(getName() + " can't run that far.");
    }

    @Override
    void swim(double distance) {
        if (distance <= 10) super.swim(distance);
        else System.out.println(getName() + " can't swim that far.");
    }

    void voice() {
        System.out.println(getName() + " is barking");
    }

    public static int getDogCounter() {
        return dogCounter;
    }
}
