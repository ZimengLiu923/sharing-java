package appointment;

import org.junit.Before;
import static org.junit.Assert.*;

import org.junit.Test;

public class DailyTest {
	
	Daily daily1;
	
	@Before
	public void setUp() {
		daily1 = new Daily("studying GRE");
	}

	@Test
	public void testDaily() {
		assertEquals("Error appointment", "studying GRE", daily1.getAppointment());
	}

	@Test
	public void testSetAppointment() {
		daily1.setAppointment("verbal");
		assertEquals("Error appointment", "verbal", daily1.getAppointment());
	}

	@Test
	public void testGetAppointment() {
		assertEquals("Error appointment", "studying GRE", daily1.getAppointment());
	}

	@Test
	public void testOccursOn() {
		assertEquals("Error appointment checking process", true, daily1.occursOn(2022, 1,1));
	}
	
	@Test
	public void testToString() {
		assertEquals("Error toString", "Daily Appointment: studying GRE", daily1.toString());
	}

}
