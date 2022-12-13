package appointment;


/**
 * Class representing an Appointment. This class is the root 
 * of the inheritance hierarchy for the appointment types
 * Daily, Monthly, and OneTime in this lab.
 * 
 * @author Zimeng Liu
 * @author Dickinson College
 * @version Dec 10, 2022
 */
public class Appointment {
	private String appointment;
	
	 /**
     * Construct a new Appointment 
     * 
     * @param appointment the content of the appointment.
     */
	public Appointment(String appointment) {
		this.appointment = appointment;
	}
	
	
	/**
     * Set the name of the Appointment.
     */
    public void setAppointment(String newAppointment) {
        this.appointment = newAppointment; 
    }
    
    
	 /**
     * Get the name of the Appointment.
     * 
     * @return the appointment
     */
    public String getAppointment() {
        return appointment;
    }
    
    
    
    /**
     * Check whether the Appointment occurs
     * 
     * @return always is true
     */
    public boolean occursOn(int year, int month, int day) {
    	return true;
    }
    
    /**
     * Create a more elegant value for appointment descriptions
     */
    public String toString() {
    	return "Appointment: " + appointment;
    }

}