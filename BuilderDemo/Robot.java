package BuilderDemo;

public class Robot implements IRobot {

    String limbs;
    String eyes;
    String speakers;

    public void setLimbs(String limbs) {
        this.limbs = limbs;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public void setSpeaker(String speaker) {
        this.speakers = speaker;
    }
}
