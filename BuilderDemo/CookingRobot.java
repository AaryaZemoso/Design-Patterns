package BuilderDemo;

public class CookingRobot implements RobotBuilder {

    IRobot robot;

    CookingRobot(IRobot robot) {
        this.robot = robot;
    }

    public void buildEyes() {
        System.out.println("Recipe listed eyes");
        this.robot.setEyes("Recipes Eyes");
    }

    public void buildLimbs() {
        System.out.println("Limbs with cooking tools are attached");
        this.robot.setLimbs("Knife, Fork, Spoon, etc Tools are attached");
    }

    public void buildSpeaker() {
        System.out.println("Speakers attached");
        this.robot.setSpeaker("Normal Speakers attached");
    }

    public IRobot getRobot() {
        return this.robot;
    }
}
