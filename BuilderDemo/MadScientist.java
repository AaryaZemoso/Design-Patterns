package BuilderDemo;

public class MadScientist{

    RobotBuilder builder;

    MadScientist(RobotBuilder builder)
    {
        this.builder = builder;
    }

    void buildRobot()
    {
        this.builder.buildEyes();
        this.builder.buildLimbs();
        this.builder.buildSpeaker();
    }

    void getRobot()
    {
        this.builder.getRobot();
    }

    public static void main(String args[])
    {
        Robot rb = new Robot();
        DrivingRobot aiDriving  = new DrivingRobot(rb);
        MadScientist elonMusk = new MadScientist(aiDriving);

        elonMusk.buildRobot();

    }
}