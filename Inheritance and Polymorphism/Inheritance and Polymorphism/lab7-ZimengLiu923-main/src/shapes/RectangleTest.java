package shapes;

import static org.junit.Assert.*;
import org.junit.*; 

import java.awt.*;


public class RectangleTest {

    private Rectangle r1;
    
    @Before
    public void setUp() throws Exception {
        r1 = new Rectangle(10,20,10,5,Color.red);
    }

    @Test
    public void testConstructor() {
        assertEquals("wrong x", 10, r1.getX());
        assertEquals("wrong y", 20, r1.getY());
        assertEquals("wrong width", 10, r1.getWidth());
        assertEquals("wrong height", 5, r1.getHeight());
        assertEquals("wrong color", Color.red, r1.getColor());
        assertTrue("should be visible", r1.isVisible());
    }
    
    @Test
    public void testSetColor() {
        r1.setColor(Color.blue);
        assertEquals("wrong color", Color.blue, r1.getColor());     
    }
    
    @Test
    public void testSetVisible() {
        r1.setVisible(false);
        assertFalse("should be invisible", r1.isVisible());
        
        r1.setVisible(true);
        assertTrue("should be visible", r1.isVisible());
    }
    
    @Test 
    public void testSetWidth() {
        r1.setWidth(10);
        assertEquals("wrong width", 10, r1.getWidth());
        
        r1.setWidth(-10);
        assertEquals("wrong width", 10, r1.getWidth());
    }
    
    @Test 
    public void testSetHeight() {
        r1.setHeight(5);
        assertEquals("wrong height", 5, r1.getHeight());
        
        r1.setHeight(-5);
        assertEquals("wrong height", 5, r1.getHeight());
    }
    
    @Test
    public void testMove() {
        r1.move(20,30);
        assertEquals("wrong x", 20, r1.getX());
        assertEquals("wrong y", 30, r1.getY());
    }
    
    @Test
    public void testTranslate() {
        r1.translate(5,10);
        assertEquals("wrong x", 15, r1.getX());
        assertEquals("wrong y", 30, r1.getY());
    }
    
    @Test
    public void testScale() {
        r1.scale(2.0);
        assertEquals("wrong width", 20, r1.getWidth());
        
        r1.scale(0.5);
        assertEquals("wrong height", 5, r1.getHeight());
        
        r1.scale(-2.0);
        assertEquals("wrong height", 5, r1.getHeight());
    }
}