package hw4_Polymorphism.Competition.Obstacle;

import hw4_Polymorphism.Competition.Pacticipants.Participant;

public class Wall extends Obstacle{
    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
