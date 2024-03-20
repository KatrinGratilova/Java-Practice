package hw3;

public class Cat extends Animal{
    private static int catCounter = 0;
    public Cat(String name) {
        super(name);
        catCounter++;
    }

    @Override
    void run(double distance) {
        if (distance <= 200) super.run(distance);
        else System.out.println(getName() + " can't run that far.");
    }

    @Override
    void swim(double distance) {
        System.out.println(getName() + " can't swim!");
    }

    public static int getCatCounter() {
        return catCounter;
    }
}
