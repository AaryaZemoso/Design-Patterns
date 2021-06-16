interface IRobot{
    void setLimbs(String limbs);
    void setEyes(String eyes);
    void setSpeaker(String speaker);
}

class Robot implements IRobot{
    
    String limbs;
    String eyes;
    String speakers;
    
    void setLimbs(String limbs)
    {
        this.limbs = limbs;
    }

    void setEyes(String eyes)
    {
        this.eyes = eyes;
    }

    void setSpeaker(String speaker)
    {
        this.speaker = speaker;
    }
}

interface RobotBuilder{
    void buildEyes();
    void buildLimbs();
    void buildSpeaker();
    Robot getRobot();
}

class CookingRobot implements RobotBuilder{
    
    IRobot robot;

    CookingRobot(IRobot robot)
    {
        this.robot = robot;
    }
    
    void buildEyes()
    {
        System.out.println("Recipe listed eyes");
        this.robot.setEyes("Recipes Eyes");
    }

    void buildLimbs()
    {
        System.out.println("Limbs with cooking tools are attached");
        this.robot.setLimbs("Knife, Fork, Spoon, etc Tools are attached");
    }

    void buildSpeaker()
    {
        System.out.println("Speakers attached");
        this.robot.setSpeaker("Normal Speakers attached");
    }

    IRobot getRobot()
    {
        return this.robot;
    }
}

class DrivingRobot implements RobotBuilder{
    
    IRobot robot;

    DrivingRobot(IRobot robot)
    {
        this.robot = robot;
    }
    
    void buildEyes()
    {
        System.out.println("Navigational eyes");
        this.robot.setEyes("Navigation view eyes");
    }

    void buildLimbs()
    {
        System.out.println("Limbs with driving tools are attached");
        this.robot.setLimbs("Wheel to control steering and pistons to push accelerator and brakes are added");
    }

    void buildSpeaker()
    {
        System.out.println("Speakers attached");
        this.robot.setSpeaker("Normal Speaker added");
    }

    IRobot getRobot()
    {
        return this.robot;
    }
}

class MadScientist{

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
}