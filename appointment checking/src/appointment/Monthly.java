package appointment;


/**
 * Class representing a Monthly. A Monthly is a monthly appointment . This
 * class is the subclass of Daily. Monthly happens on the same day each month.
 * 
 * @author Zimeng Liu
 * @author Dickinson College
 * @version Nov 27, 2022
 */
public class Monthly extends Daily {
	private int day;
	
	/**
     * Construct a new Monthly
     * 
     * @param appointment the content of the appointment.
     * @param day the day of the appointment happens on for each month.
     */
	public Monthly(String appointment, int day) {
		super(appointment);
		this.day = day;
	}
	
	/**
     * Set the date of the Monthly appointment.
     */
    public void setDay(int newDay) {
        this.day = newDay; 
    }
    
    
	 /**
     * Get the date of the Monthly appointment.
     * 
     * @return the day
     */
    public int getDay() {
        return this.day;
    }

    
    /**
     * Check whether the Monthly appointment on the certain day for every month
     * 
     * @return true if day is the same
     */
    public boolean occursOn(int year, int month, int day) {
    	if (this.day == day) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    /**
     * Create a more elegant value for monthly appointment descriptions
     */
    public String toString() {
    	return "Monthly Appointment: " + getAppointment();
    }
    
    
}
