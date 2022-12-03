package shapes;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class DrawableObjectListTest {

	@Test
	public void testDrawableObjectList() {
		
		Drawable c1 = new Circle(10,20,5,Color.red);
		Drawable c2 = new Circle(10,20,10,Color.yellow);
		DrawableObjectList testList = new DrawableObjectList();
	}
	
	@Test
	public void testGetSize() {
		
		Drawable c1 = new Circle(10,20,5,Color.red);
		Drawable c2 = new Circle(10,20,10,Color.yellow);
		DrawableObjectList testList = new DrawableObjectList();
		testList.addDrawable(c1);
		testList.addDrawable(c2);
		assertEquals("Wrong Size", 2, testList.getSize());
	}	
	
	@Test
	public void testAddDrawable() {
		
		Drawable c1 = new Circle(10,20,5,Color.red);
		Drawable c2 = new Circle(10,20,10,Color.yellow);
		Drawable c3 = new Circle(10,20,2,Color.blue);
		DrawableObjectList testList = new DrawableObjectList();
		testList.addDrawable(c1);
		testList.addDrawable(c2);
		assertEquals("Wrong Size", 2, testList.getSize());
		testList.addDrawable(c3);
		assertEquals("Wrong Size", 3, testList.getSize());
	}
	
	@Test
	public void testRemoveDrawable() {
		
		Drawable c1 = new Circle(10,20,5,Color.red);
		Drawable c2 = new Circle(10,20,10,Color.yellow);
		Drawable c3 = new Circle(10,20,2,Color.blue);
		DrawableObjectList testList = new DrawableObjectList();
		testList.addDrawable(c1);
		testList.addDrawable(c2);
		testList.addDrawable(c3);
		assertEquals("Wrong Size", 3, testList.getSize());
		testList.removeDrawable(c2);
		assertEquals("Wrong Size", 2, testList.getSize());
	}	
	
	@Test
	public void testScaleAll() {
		
		Circle c1 = new Circle(10,20,5,Color.red);
		Circle c2 = new Circle(10,20,10,Color.yellow);
		Circle c3 = new Circle(10,20,2,Color.blue);
		DrawableObjectList testList = new DrawableObjectList();
		testList.addDrawable(c1);
		testList.addDrawable(c2);
		testList.addDrawable(c3);
		testList.scaleAll(2.0);
		assertEquals("Wrong Radius", 10, c1.getRadius());
		assertEquals("Wrong Radius", 20, c2.getRadius());
		assertEquals("Wrong Radius", 4, c3.getRadius());
	}
}
