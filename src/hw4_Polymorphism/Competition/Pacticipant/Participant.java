package hw4_Polymorphism.Competition.Pacticipant;

import hw4_Polymorphism.Competition.Obstacle.Obstacle;
import hw4_Polymorphism.Competition.Obstacle.RunningTrack;
import hw4_Polymorphism.Competition.Obstacle.Wall;

public abstract class Participant {
    protected final String name;
    protected final int heightLimit;
    protected final int lengthLimit;

    public Participant(String name, int heightLimit, int lengthLimit) {
        this.name = name;
        this.heightLimit = heightLimit;
        this.lengthLimit = lengthLimit;
    }

    public boolean overcome(Obstacle obstacle){
        if (obstacle instanceof RunningTrack) {
            RunningTrack runningTrack = (RunningTrack) obstacle;
            return this.run(runningTrack.getLength(), runningTrack.getName());
        }
        else if (obstacle instanceof Wall) {
            Wall wall = (Wall) obstacle;
            return this.jump(wall.getHeight(), wall.getName());
        }
        return false;
    }

    abstract boolean run(int length, String name);

    abstract boolean jump(int height, String name);
}
