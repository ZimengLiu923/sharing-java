package appointment;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class MonthlyTest {
	
	Monthly monthly1;
	
	@Before
	public void setUp() {
		monthly1 = new Monthly("QR meeting", 6);
	}

	@Test
	public void testMonthly() {
		assertEquals("Error appointment", "QR meeting", monthly1.getAppointment());
		assertEquals("Error day", 6, monthly1.getDay());
	}

	@Test
	public void testSetDay() {
		monthly1.setDay(17);
		assertEquals("Error day", 17, monthly1.getDay());
	}

	@Test
	public void testGetDay() {
		assertEquals("Error day", 6, monthly1.getDay());
	}

	@Test
	public void testOccursOnInt() {
		assertEquals("Error appointment checking process", true, monthly1.occursOn(2022, 1, 6));
	}

	@Test
	public void testSetAppointment() {
		monthly1.setAppointment("Issei");
		assertEquals("Error appointment", "Issei", monthly1.getAppointment());
	}

	@Test
	public void testGetAppointment() {
		assertEquals("Error appointment", "QR meeting", monthly1.getAppointment());
	}
	
	@Test
	public void testToString() {
		assertEquals("Error toString", "Monthly Appointment: QR meeting", monthly1.toString());
	}


}
