package hw4_Polymorphism.Competition;

import hw4_Polymorphism.Competition.Obstacle.Obstacle;
import hw4_Polymorphism.Competition.Obstacle.RunningTrack;
import hw4_Polymorphism.Competition.Obstacle.Wall;
import hw4_Polymorphism.Competition.Pacticipant.Cat;
import hw4_Polymorphism.Competition.Pacticipant.Human;
import hw4_Polymorphism.Competition.Pacticipant.Participant;
import hw4_Polymorphism.Competition.Pacticipant.Robot;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Gratilova Kate", 100, 1500),
                new Cat("Gray", 50, 600),
                new Human("Marilyn Manson", 300, 2000),
                new Robot("Bot", 500, 3500)
        };
        Obstacle[] obstacles = {
                new RunningTrack("low speed", 500),
                new Wall("short", 20),
                new RunningTrack("faster speed", 1000),
                new Wall("high", 300),
                new RunningTrack("medium", 3000)
        };

        for (Participant participant: participants){
            for (Obstacle obstacle: obstacles){
                if(!participant.overcome(obstacle)){
                    break;
                }
            }
        }
    }
}
