package shapes;

import static org.junit.Assert.*;
import org.junit.*; 

import java.awt.*;


public class OvalTest {

    private Oval o1;
    
    @Before
    public void setUp() throws Exception {
        o1 = new Oval(10,20,10,5,Color.red);
    }

    @Test
    public void testConstructor() {
        assertEquals("wrong x", 10, o1.getX());
        assertEquals("wrong y", 20, o1.getY());
        assertEquals("wrong width", 10, o1.getWidth());
        assertEquals("wrong height", 5, o1.getHeight());
        assertEquals("wrong color", Color.red, o1.getColor());
        assertTrue("should be visible", o1.isVisible());
    }
    
    @Test
    public void testSetColor() {
        o1.setColor(Color.blue);
        assertEquals("wrong color", Color.blue, o1.getColor());     
    }
    
    @Test
    public void testSetVisible() {
        o1.setVisible(false);
        assertFalse("should be invisible", o1.isVisible());
        
        o1.setVisible(true);
        assertTrue("should be visible", o1.isVisible());
    }
    
    @Test 
    public void testSetWidth() {
        o1.setWidth(10);
        assertEquals("wrong width", 10, o1.getWidth());
        
        o1.setWidth(-10);
        assertEquals("wrong width", 10, o1.getWidth());
    }
    
    @Test 
    public void testSetHeight() {
        o1.setHeight(5);
        assertEquals("wrong height", 5, o1.getHeight());
        
        o1.setHeight(-5);
        assertEquals("wrong height", 5, o1.getHeight());
    }
    
    @Test
    public void testMove() {
        o1.move(20,30);
        assertEquals("wrong x", 20, o1.getX());
        assertEquals("wrong y", 30, o1.getY());
    }
    
    @Test
    public void testTranslate() {
        o1.translate(5,10);
        assertEquals("wrong x", 15, o1.getX());
        assertEquals("wrong y", 30, o1.getY());
    }
    
    @Test
    public void testScale() {
        o1.scale(2.0);
        assertEquals("wrong width", 20, o1.getWidth());
        
        o1.scale(0.5);
        assertEquals("wrong height", 5, o1.getHeight());
        
        o1.scale(-2.0);
        assertEquals("wrong height", 5, o1.getHeight());
    }
}