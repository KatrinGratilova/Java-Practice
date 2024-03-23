package hw4_Polymorphism.Competition.Obstacle;

import hw4_Polymorphism.Competition.Pacticipants.Participant;

public class RunningTrack extends Obstacle {
    private final int length;

    public RunningTrack(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
