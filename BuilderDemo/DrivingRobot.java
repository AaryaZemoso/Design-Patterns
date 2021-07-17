package BuilderDemo;

public class DrivingRobot implements RobotBuilder {

    IRobot robot;

    DrivingRobot(IRobot robot) {
        this.robot = robot;
    }

    public void buildEyes() {
        System.out.println("Navigational eyes");
        this.robot.setEyes("Navigation view eyes");
    }

    public void buildLimbs() {
        System.out.println("Limbs with driving tools are attached");
        this.robot.setLimbs("Wheel to control steering and pistons to push accelerator and brakes are added");
    }

    public void buildSpeaker() {
        System.out.println("Speakers attached");
        this.robot.setSpeaker("Normal Speaker added");
    }

    public IRobot getRobot() {
        return this.robot;
    }
}
