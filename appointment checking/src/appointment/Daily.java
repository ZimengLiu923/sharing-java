package appointment;


/**
 * Class representing a Daily. A Daily is a daily appointment.
 * This class is the subclass of Appointment. 
 * Daily happens on everyday.
 * 
 * @author Zimeng Liu
 * @author Dickinson College
 * @version Dec 10, 2022
 */
public class Daily extends Appointment{
	
	public Daily(String appointment) {
		super(appointment);
	}
	
    /**
     * Create a more elegant value for daily appointment descriptions
     */
    public String toString() {
    	return "Daily Appointment: " + getAppointment();
    }

}
