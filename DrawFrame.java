
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(200, 75), 400, Color.DARK_GRAY, true);
        
        // Ears:
        
        RightTriangle leftEar = new RightTriangle(new Point(300, 120), -25, -75, Color.DARK_GRAY, true);
        RightTriangle leftInnerEar = new RightTriangle(new Point(300, 120), -20, -70, Color.PINK, true);
        RightTriangle rightEar = new RightTriangle(new Point(500, 120), 25, -75, Color.DARK_GRAY, true);
        RightTriangle rightInnerEar = new RightTriangle(new Point(500, 120), 20, -70, Color.PINK, true);
        
        // Eyes:
        
        Oval leftWhiteEye = new Oval(new Point(270, 150), 50, 100, Color.WHITE, true);
        Oval leftBlackEye = new Oval(new Point(275, 155), 40, 90, Color.BLACK, true);
        Oval rightWhiteEye = new Oval(new Point(470, 150), 50, 100, Color.WHITE, true);
        Oval rightBlackEye = new Oval(new Point(475, 155), 40, 90, Color.BLACK, true);
        
        // Nose and Whiskers:
        
        Circle nose = new Circle(new Point(385, 260), 40, Color.BLACK, true);
        Oval tongue = new Oval(new Point(420, 320), 30, 60, Color.RED, true);
        Diamond leftWiskers = new Diamond(new Point(380, 350), 75, Color.BLACK, true);
        Diamond rightWiskers = new Diamond(new Point(420, 350), 75, Color.BLACK, true);
        
        // Collar:
        
        Oval collar = new Oval(new Point(100, 450), 600, 50, Color.BLUE, true);
        Circle ring = new Circle(new Point(365, 435), 75, Color.RED, true);
        Circle innerRing = new Circle(new Point(370, 440), 60, Color.GREEN, false);
        
        // Square around the dog:
        
        Square back = new Square(new Point(400, 275), 400, Color.PINK, false);
        Circle backCircle = new Circle(new Point(50,-100), 700, Color.BLACK, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(nose);
        drawPanel.addShape(back);
        drawPanel.addShape(leftWhiteEye);
        drawPanel.addShape(leftBlackEye);
        drawPanel.addShape(rightWhiteEye);
        drawPanel.addShape(rightBlackEye);
        drawPanel.addShape(leftEar);
        drawPanel.addShape(leftInnerEar);
        drawPanel.addShape(rightEar);
        drawPanel.addShape(rightInnerEar);
        drawPanel.addShape(collar);
        drawPanel.addShape(ring);
        drawPanel.addShape(innerRing);
        drawPanel.addShape(backCircle);
        drawPanel.addShape(leftWiskers);
        drawPanel.addShape(rightWiskers);
        drawPanel.addShape(tongue);
        
        // set background color
        drawPanel.setBackground(Color.CYAN);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
