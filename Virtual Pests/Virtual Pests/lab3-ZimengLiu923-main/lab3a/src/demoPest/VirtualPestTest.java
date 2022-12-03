package demoPest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VirtualPestTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConstructor()
	{
		VirtualPest virtualP1 = new VirtualPest("Fred", 1);
		assertEquals("Fred", virtualP1.getName());
		assertEquals(1, virtualP1.getIntState());
	}
	
	@Test
	public void testGetFile()
	{
		VirtualPest virtualP1 = new VirtualPest("Fred", 1);
		assertEquals("lab3a/src/demoPest/fish.jpg", virtualP1.getFile());
    }

	@Test
	public void testGetNumActions()
	{
		VirtualPest virtualP1 = new VirtualPest("Fred", 1);
		assertEquals(3, virtualP1.getNumActions());
	}
    
	@Test
    public void testGetState()
	{
		VirtualPest virtualP2 = new VirtualPest("Fred", 1);
		assertEquals("hungry", virtualP2.getState());
	    virtualP2 = new VirtualPest("Fred", 2);
		assertEquals("sleepy", virtualP2.getState());
	    virtualP2 = new VirtualPest("Fred", 3);
		assertEquals("full", virtualP2.getState());    
	    virtualP2 = new VirtualPest("Fred", 4);
		assertEquals("grouchy", virtualP2.getState());    
	    virtualP2 = new VirtualPest("Fred", 5);
		assertEquals("error", virtualP2.getState());
    }
     
	@Test
    public void testGetAction()
	{
		VirtualPest virtualP2 = new VirtualPest("Fred", 1);
		assertEquals("feed", virtualP2.getAction(1));
		assertEquals("pet", virtualP2.getAction(2));
		assertEquals("put to bed", virtualP2.getAction(3));
		assertEquals("", virtualP2.getAction(4));
    }
	
	@Test
	public void testGetPestSound()
	{
		VirtualPest virtualP31 = new VirtualPest("Fred",1);
		assertEquals("The sound of state 1: ", "blurp!", virtualP31.getPestSound());
		VirtualPest virtualP32 = new VirtualPest("Fred",2);
		assertEquals("The sound of state 2:", "zzZZzzzZz", virtualP32.getPestSound());
		VirtualPest virtualP33 = new VirtualPest("Fred",3);
		assertEquals("The sound of state 3: ", "BLURP!", virtualP33.getPestSound());
		VirtualPest virtualP34 = new VirtualPest("Fred",4);
		assertEquals("The sound of state 4: ", "blurp! bubble bubble ...", virtualP34.getPestSound());
		VirtualPest virtualP35 = new VirtualPest("Fred",5);
		assertEquals("The sound of state 5: ", "", virtualP35.getPestSound());
	}
	
	@Test
	public void testGetPestAction()
	{
		VirtualPest virtualP41 = new VirtualPest("Fred",1);
		assertEquals("The pest action of state 1: ", "swim to top", virtualP41.getPestAction());
		VirtualPest virtualP42 = new VirtualPest("Fred",2);
		assertEquals("The pest action of state 2: ", "lay on bottom", virtualP42.getPestAction());
		VirtualPest virtualP43 = new VirtualPest("Fred",3);
		assertEquals("The pest action of state 3: ", "sulk on bottom", virtualP43.getPestAction());
		VirtualPest virtualP44 = new VirtualPest("Fred",4);
		assertEquals("The pest action of state 4: ", "swim to bottom", virtualP44.getPestAction());
		VirtualPest virtualP45 = new VirtualPest("Fred",5);
		assertEquals("The pest action of state 5: ", "", virtualP45.getPestAction());
	}
	
	public void testDoAction() 
	{
		VirtualPest virtualP5 = new VirtualPest("Fred",1);
		//virtualP5.getIntState();
		virtualP5.doAction(0);
		assertEquals("The pest new state: ", 2, virtualP5.getIntState());
		virtualP5.doAction(1);
		assertEquals("The pest new state: ", 3, virtualP5.getIntState());
		virtualP5.doAction(2);
		assertEquals("The pest new state: ", 1, virtualP5.getIntState());
		virtualP5.doAction(3);
		assertEquals("The pest new state: ", 1, virtualP5.getIntState());
		
		VirtualPest virtualP51 = new VirtualPest("Fred",2);
		//virtualP5.getIntState();
		virtualP51.doAction(0);
		assertEquals("The pest new state: ", 1, virtualP51.getIntState());
		virtualP51.doAction(1);
		assertEquals("The pest new state: ", 2, virtualP51.getIntState());
		virtualP51.doAction(2);
		assertEquals("The pest new state: ", 2, virtualP51.getIntState());
		virtualP51.doAction(3);
		assertEquals("The pest new state: ", 4, virtualP51.getIntState());
		
		VirtualPest virtualP52 = new VirtualPest("Fred",3);
		//virtualP5.getIntState();
		virtualP52.doAction(0);
		assertEquals("The pest new state: ", 4, virtualP52.getIntState());
		virtualP52.doAction(1);
		assertEquals("The pest new state: ", 3, virtualP52.getIntState());
		virtualP52.doAction(2);
		assertEquals("The pest new state: ", 2, virtualP52.getIntState());
		virtualP52.doAction(3);
		assertEquals("The pest new state: ", 3, virtualP52.getIntState());
		
		VirtualPest virtualP53 = new VirtualPest("Fred",4);
		//virtualP5.getIntState();
		virtualP53.doAction(0);
		assertEquals("The pest new state: ", 4, virtualP53.getIntState());
		virtualP53.doAction(1);
		assertEquals("The pest new state: ", 4, virtualP53.getIntState());
		virtualP53.doAction(2);
		assertEquals("The pest new state: ", 1, virtualP53.getIntState());
		virtualP53.doAction(3);
		assertEquals("The pest new state: ", 4, virtualP53.getIntState());
		
	}
}
