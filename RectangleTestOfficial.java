import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RectangleTestOfficial
{
    public Rectangle rect1 = new Rectangle(new Point(200, 200), 200, 100, Color.BLACK, true);
    public Rectangle rect2 = new Rectangle(new Point(200, 200), 100, 200, Color.BLUE, false);
    
    @Test
    public void testRectangleConstructor() {
        Assert.assertEquals(true, rect1.isFilled());
        Assert.assertEquals(false, rect2.isFilled());
        
        Assert.assertEquals(4, rect1.getLocation().length);
        Assert.assertEquals(4, rect2.getLocation().length);
        
        Assert.assertEquals(Color.BLACK, rect1.getColor());
        Assert.assertEquals(Color.BLUE, rect2.getColor());
        
        Assert.assertEquals(new Point(100, 150), rect1.getLocation()[0]);
        Assert.assertEquals(new Point(100, 250), rect1.getLocation()[1]);
        Assert.assertEquals(new Point(300, 250), rect1.getLocation()[2]);
        Assert.assertEquals(new Point(300, 150), rect1.getLocation()[3]);
        
        Assert.assertEquals(new Point(150, 100), rect2.getLocation()[0]);
        Assert.assertEquals(new Point(150, 300), rect2.getLocation()[1]);
        Assert.assertEquals(new Point(250, 300), rect2.getLocation()[2]);
        Assert.assertEquals(new Point(250, 100), rect2.getLocation()[3]);
    }
}
