package appointment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppointmentTest {
	
	Appointment appointment1;
	
	@Before
	public void setUp() {
		appointment1 = new Appointment("studying GRE");
	}
	
	@Test
	public void testAppointment() {
		assertEquals("Error appointment", "studying GRE", appointment1.getAppointment());
	}

	@Test
	public void testSetAppointment() {
		appointment1.setAppointment("verbal");
		assertEquals("Error appointment", "verbal", appointment1.getAppointment());
	}

	@Test
	public void testGetAppointment() {
		assertEquals("Error appointment", "studying GRE", appointment1.getAppointment());
	}

	@Test
	public void testOccursOn() {
		assertEquals("Error appointment checking process", true, appointment1.occursOn(2022, 1,1));
	}
	
	@Test
	public void testToString() {
		assertEquals("Error toString", "Appointment: studying GRE", appointment1.toString());
	}
}
