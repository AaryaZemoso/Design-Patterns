package PrototypeDemo;

public class Button implements Prototype<Button>{

    int width;
    int height;

    int color;

    String text;

    Button(int width, int height, int color, String text)
    {
        this.width = width;
        this.height = height;
        this.color = color;
        this.text = text;
    }

    Button(Button otherButton)
    {
        this.width = otherButton.width;
        this.height = otherButton.height;
        this.color = otherButton.color;
        this.text = otherButton.text;
    }

    public Button getClone()
    {
        return new Button(this);
    }

    public static void main(String args[])
    {
        Button reset = new Button(300, 400, 25, "Reset");
        Button resetCopy = reset.getClone();

        if(reset != resetCopy)
            System.out.println("Both have seperate Addresses");

        else
            System.out.println("Both have same Addresses");
    }

}
