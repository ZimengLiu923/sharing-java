package shapes;
import java.awt.*;

import shapes.Rectangle;

/**
 * Sample program that draws a multicolored candle at the center of the
 * window.
 *
 * @author US
 * @author Dickinson College
 * @version Oct 18, 2022
 */
public class Candle {
	/**
     * Draw a multicolored candle at the center of the window.
     * 
     * @param args none
     */
	
    public static void main(String[] args) {
        DrawableObjectList objList = new DrawableObjectList();
        DrawingTablet tablet = new DrawingTablet("Candle", 200, 200, objList);

        Rectangle r1 = new Rectangle(80, 70, 30, 50, Color.red);
        objList.addDrawable(r1);
        
        Oval o2 = new Oval(87, 50, 15, 20, Color.white);
        objList.addDrawable(o2);
        
        Oval o3 = new Oval(90, 55, 10, 15, Color.orange);
        objList.addDrawable(o3);
        
        Oval o4 = new Oval(91, 60, 5, 10, Color.blue);
        objList.addDrawable(o4);
        
        tablet.repaint();
    }
}
