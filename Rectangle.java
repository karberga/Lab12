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
        super(color, filled);
        
        // coordinates for first point
        int point1X = center.x - width/2;
        int point1Y = center.y - height/2;
        
        // coordinates for second point
        int point2X = center.x - width/2;
        int point2Y = center.y + height/2;
        
        // coordinates for third point
        int point3X = center.x + width/2;
        int point3Y = center.y + height/2;
        
        // coordinates for forth point
        int point4X = center.x + width/2;
        int point4Y = center.y - height/2;
        
        super.location = new Point[4];
        location[0] = new Point(point1X, point1Y);
        location[1] = new Point(point2X, point2Y);
        location[2] = new Point(point3X, point3Y);
        location[3] = new Point(point4X, point4Y);
    }
}