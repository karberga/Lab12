import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Rectangle and extends Polygon.
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class Rectangle extends Polygon
{

    /**
     * Constructor for the Rectangle class
     * 
     * @param center Center point of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param color Desired color for the rectangle
     * @param filled Whether or not the rectangle should be filled solid
     */
    public Rectangle(Point center, int width, int height, Color color, boolean filled)
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        int startX = center - width/2;
        int startY = center - height/2;
        
        int endX = center + width/2;
        int endY = center + height/2;
        
        g.drawRect(startX, startY, endX, endY);
        
        startX += 30;
        startY += 30;
        
        endX += 30;
        endY += 30;
        
        g.setColor(Color.RED);
        g.fillRect(startX, startY, endX, endY);
    }
}