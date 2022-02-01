/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Circle skin;
    private Triangle nose;
    private Circle eye1;
    private Circle eye2;
    private Square mohawk;
    private Person eyebrows;
    private Square head_hider;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        skin = new Circle();
        nose = new Triangle();
        eye1 = new Circle();
        eye2 = new Circle();
        mohawk = new Square();
        eyebrows = new Person();
        head_hider = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            skin.changeColor("blue");
            skin.moveHorizontal(-170);
            skin.moveVertical(-50);
            skin.changeSize(250);
            skin.makeVisible();
            
            nose.changeColor("green");
            nose.moveHorizontal(-20);
            nose.moveVertical(25);
            nose.changeSize(60,70);
            nose.makeVisible();
    
            eye1.changeColor("black");
            eye1.changeSize(50);
            eye1.moveHorizontal(-115);
            eye1.moveVertical(10);
            eye1.makeVisible();
    
            eye2.changeColor("black");
            eye2.moveVertical(10);
            eye2.changeSize(50);
            eye2.makeVisible();
            
            mohawk.changeColor("red");
            mohawk.moveHorizontal(-150);
            mohawk.moveVertical(-120);
            mohawk.changeSize(60);
            mohawk.makeVisible();
            
            eyebrows.changeColor("black");
            eyebrows.moveHorizontal(-85);
            eyebrows.moveVertical(-95);
            eyebrows.changeSize(2, 200);
            eyebrows.makeVisible();
            
            head_hider.changeColor("blue");
            head_hider.moveHorizontal(-120);
            head_hider.moveVertical(-40);
            head_hider.changeSize(10);
            head_hider.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        skin.changeColor("black");
        nose.changeColor("white");
        eye1.changeColor("white");
        eye2.changeColor("white");
        mohawk.changeColor("white");
        eyebrows.changeColor("white");
        head_hider.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        skin.changeColor("blue");
        nose.changeColor("green");
        eye1.changeColor("black");
        eye2.changeColor("black");
        mohawk.changeColor("red");
        eyebrows.changeColor("black");
        head_hider.changeColor("blue");
    }
}
