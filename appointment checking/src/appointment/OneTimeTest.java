package appointment;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class OneTimeTest {
	
	OneTime oneTime1;
	
	@Before
	public void setUp() {
		oneTime1 = new OneTime("Nanzan Exchange", 2022, 11, 17);
	}

	@Test
	public void testOneTime() {
		assertEquals("Error appointment", "Nanzan Exchange", oneTime1.getAppointment());
		assertEquals("Error day", 17, oneTime1.getDay());
		assertEquals("Error month", 11, oneTime1.getMonth());
		assertEquals("Error year", 2022, oneTime1.getYear());
	}

	@Test
	public void testSetMonth() {
		oneTime1.setMonth(12);
		assertEquals("Error month", 12, oneTime1.getMonth());
	}

	@Test
	public void testGetMonth() {
		assertEquals("Error month", 11, oneTime1.getMonth());
	}

	@Test
	public void testSetYear() {
		oneTime1.setYear(2023);
		assertEquals("Error year", 2023, oneTime1.getYear());
	}

	@Test
	public void testGetYear() {
		assertEquals("Error year", 2022, oneTime1.getYear());
	}

	@Test
	public void testOccursOnIntIntInt() {
		assertEquals("Error appointment checking process", true, oneTime1.occursOn(2022, 11, 17));
	}

	@Test
	public void testSetDay() {
		oneTime1.setDay(6);
		assertEquals("Error Day", 6, oneTime1.getDay());
	}

	@Test
	public void testGetDay() {
		assertEquals("Error Day", 17, oneTime1.getDay());
	}

	@Test
	public void testSetAppointment() {
		oneTime1.setAppointment("Dentist");
		assertEquals("Error appointment", "Dentist", oneTime1.getAppointment());
	}

	@Test
	public void testGetAppointment() {
		assertEquals("Error appointment", "Nanzan Exchange", oneTime1.getAppointment());
	}
	
	@Test
	public void testToString() {
		assertEquals("Error toString", "One-time Appointment: Nanzan Exchange", oneTime1.toString());
	}

}
