package hw4_Polymorphism.Competition.Obstacle;

import hw4_Polymorphism.Competition.Pacticipants.Participant;

public abstract class Obstacle {
    private final String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
