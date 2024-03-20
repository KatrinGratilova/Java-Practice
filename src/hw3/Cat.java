package hw3;

public class Cat extends Animal{
    private static int catCounter = 0;
    public Cat(String name) {
        super(name);
        catCounter++;
    }

    @Override
    void run(int distance) {
        if (distance <= 200) super.run(distance);
        else System.out.println(getName() + " is too tired to run.");
    }

    @Override
    void swim(int distance) {
        System.out.println(getName() + " can't swim!");
    }

    public static int getCatCounter() {
        return catCounter;
    }
}
