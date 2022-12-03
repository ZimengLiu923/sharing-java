package ownPest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OwnVirtualPestTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConstructor()
	{
		OwnVirtualPest ownP1 = new OwnVirtualPest("Nova", 1);
		assertEquals("Nova", ownP1.getName());
		assertEquals(1, ownP1.getIntState());
	}
	
	@Test
	public void testGetFile()
	{
		OwnVirtualPest ownP1 = new OwnVirtualPest("Nova", 1);
		assertEquals("lab3b/src/ownPest/myImg.jpg", ownP1.getFile());
    }

	@Test
	public void testGetNumActions()
	{
		OwnVirtualPest ownP1 = new OwnVirtualPest("Nova", 1);
		assertEquals(3, ownP1.getNumActions());
	}
    
	@Test
    public void testGetState()
	{
		OwnVirtualPest ownP2 = new OwnVirtualPest("Nova", 1);
		assertEquals("happy", ownP2.getState());
	    ownP2 = new OwnVirtualPest("Nova", 2);
		assertEquals("angry", ownP2.getState());
	    ownP2 = new OwnVirtualPest("Nova", 3);
		assertEquals("sleepy", ownP2.getState());    
	    ownP2 = new OwnVirtualPest("Nova", 4);
		assertEquals("hungry", ownP2.getState());    
	    ownP2 = new OwnVirtualPest("Nova", 5);
		assertEquals("error", ownP2.getState());
    }
     
	@Test
    public void testGetAction()
	{
		OwnVirtualPest ownP2 = new OwnVirtualPest("Nova", 1);
		assertEquals("feed", ownP2.getAction(1));
		assertEquals("shout", ownP2.getAction(2));
		assertEquals("we eat", ownP2.getAction(3));
		assertEquals("", ownP2.getAction(4));
    }
		
	@Test
	public void testGetPestSound()
	{
		OwnVirtualPest ownP31 = new OwnVirtualPest("Nova", 1);
		assertEquals("Woowoo", ownP31.getPestSound());
		OwnVirtualPest ownP32 = new OwnVirtualPest("Nova", 2);
		assertEquals("Grrr", ownP32.getPestSound());
		OwnVirtualPest ownP33 = new OwnVirtualPest("Nova", 3);
		assertEquals("zzZZzz", ownP33.getPestSound());
		OwnVirtualPest ownP34 = new OwnVirtualPest("Nova", 4);
		assertEquals("Meeee", ownP34.getPestSound());
		OwnVirtualPest ownP35 = new OwnVirtualPest("Nova", 5);
		assertEquals("", ownP35.getPestSound());
	}
	public void testGetPestAction()
	{
		OwnVirtualPest ownP41 = new OwnVirtualPest("Nova", 1);
		assertEquals("wag tail", ownP41.getPestAction());
		OwnVirtualPest ownP42 = new OwnVirtualPest("Nova", 2);
		assertEquals("bark", ownP42.getPestAction());
		OwnVirtualPest ownP43 = new OwnVirtualPest("Nova", 3);
		assertEquals("snore", ownP43.getPestAction());
		OwnVirtualPest ownP44 = new OwnVirtualPest("Nova", 4);
		assertEquals("beg", ownP44.getPestAction());
		OwnVirtualPest ownP45 = new OwnVirtualPest("Nova", 5);
		assertEquals("", ownP45.getPestAction());
	}
	public void testDoAction()
	{
		OwnVirtualPest ownP51 = new OwnVirtualPest("Nova", 1);
		ownP51.doAction(1);
		assertEquals("State 1, action 1, error doAction()", 1, ownP51.getIntState());
		ownP51.doAction(2);
		assertEquals("State 1, action 2, error doAction()", 2, ownP51.getIntState());
		ownP51.doAction(3);
		assertEquals("State 1, action 3, error doAction()", 4, ownP51.getIntState());
		ownP51.doAction(4);
		assertEquals("State 1, action 4, error doAction()", 3, ownP51.getIntState());
		
		OwnVirtualPest ownP52 = new OwnVirtualPest("Nova", 2);
		ownP52.doAction(1);
		assertEquals("State 2, action 1, error doAction()", 1, ownP52.getIntState());
		ownP52.doAction(2);
		assertEquals("State 2, action 2, error doAction()", 2, ownP52.getIntState());
		ownP52.doAction(3);
		assertEquals("State 2, action 3, error doAction()", 2, ownP52.getIntState());
		ownP52.doAction(4);
		assertEquals("State 2, action 4, error doAction()", 3, ownP52.getIntState());
		
		OwnVirtualPest ownP53 = new OwnVirtualPest("Nova", 3);
		ownP53.doAction(1);
		assertEquals("State 3, action 1, error doAction()", 3, ownP53.getIntState());
		ownP53.doAction(2);
		assertEquals("State 3, action 2, error doAction()", 2, ownP53.getIntState());
		ownP53.doAction(3);
		assertEquals("State 3, action 3, error doAction()", 4, ownP53.getIntState());
		ownP53.doAction(4);
		assertEquals("State 3, action 4, error doAction()", 3, ownP53.getIntState());
		
		OwnVirtualPest ownP54 = new OwnVirtualPest("Nova", 4);
		ownP54.doAction(1);
		assertEquals("State 4, action 1, error doAction()", 1, ownP54.getIntState());
		ownP54.doAction(2);
		assertEquals("State 4, action 2, error doAction()", 4, ownP54.getIntState());
		ownP54.doAction(3);
		assertEquals("State 4, action 3, error doAction()", 4, ownP54.getIntState());
		ownP54.doAction(4);
		assertEquals("State 4, action 4, error doAction()", 3, ownP54.getIntState());
	}
}
	
	
	