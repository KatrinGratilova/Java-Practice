package hw4_Polymorphism.Competition.Pacticipant;

public class Robot extends Participant {

    public Robot(String name, int heightLimit, int lengthLimit) {
        super(name, heightLimit, lengthLimit);
    }

    @Override
    public boolean run(int length, String name) {
        if (length <= lengthLimit) {
            System.out.println("Robot " + this.name + " reached running track '" + name + "' with distance " + length);
            return true;
        }
        System.out.println("Robot " + this.name + " couldn't reach running track '" + name
                    + "' with distance " + length + ". It was reached only " + lengthLimit );
        return false;
    }

    @Override
    public boolean jump(int height, String name) {
        if (height <= heightLimit){
            System.out.println("Robot " + this.name + " reached wall '" + name + "' with distance " + height);
            return true;
        }
        System.out.println("Robot " + this.name + " couldn't reach wall '" + name
                    + "' with height " + height + ". It was reached only " + heightLimit );
        return false;
    }
}
