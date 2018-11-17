import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class RightTriangleTestOfficial
{
    public RightTriangle right1 = new RightTriangle(new Point(200, 200), 20, 20, Color.BLACK, true);
    public RightTriangle right2 = new RightTriangle(new Point(100, 100), -20, -20, Color.BLUE, false);
    
    @Test
    public void testRightTriangleConstructor() {
        Assert.assertEquals(true, right1.isFilled());
        Assert.assertEquals(false, right2.isFilled());
        
        Assert.assertEquals(Color.BLACK, right1.getColor());
        Assert.assertEquals(Color.BLUE, right2.getColor());
        
        Assert.assertEquals(3, right1.getLocation().length);
        Assert.assertEquals(3, right2.getLocation().length);
        
        Assert.assertEquals(new Point(200, 200), right1.getLocation()[0]);
        Assert.assertEquals(new Point(220, 200), right1.getLocation()[1]);
        Assert.assertEquals(new Point(200, 220), right1.getLocation()[2]);
        
        Assert.assertEquals(new Point(100, 100), right2.getLocation()[0]);
        Assert.assertEquals(new Point(80, 100), right2.getLocation()[1]);
        Assert.assertEquals(new Point(100, 80), right2.getLocation()[2]);
    }
    
}
