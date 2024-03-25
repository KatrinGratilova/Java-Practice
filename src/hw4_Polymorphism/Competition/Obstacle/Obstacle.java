package hw4_Polymorphism.Competition.Obstacle;

public abstract class Obstacle {
    private final String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
