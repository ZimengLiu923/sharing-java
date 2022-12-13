package appointment;


/**
 * Class representing a OneTime. A OneTime is a one-time appointment . This
 * class is the subclass of Monthly. 
 * OneTime happens on the certain day in the certain month in the certain year.
 * 
 * @author Zimeng Liu
 * @author Dickinson College
 * @version Nov 27, 2022
 */
public class OneTime extends Monthly {
	private int month;
	private int year;
	
	/**
     * Construct a new OneTime
     * 
     * @param appointment the content of the appointment.
     * @param day the day of the one-time appointment happens on.
     * @param month the month of the one-time appointment happens in.
     * @param year the year of the one-time appointment happens in.
     */
	public OneTime(String appointment, int year, int month, int day) {
		super(appointment, day);
		this.month = month;
		this.year = year;
	}
	
	/**
     * Set the month of the OneTime appointment.
     */
    public void setMonth(int newMonth) {
        this.month = newMonth; 
    }
    
    
	 /**
     * Get the month of the OneTime appointment.
     * 
     * @return the month
     */
    public int getMonth() {
        return this.month;
    }

	/**
     * Set the year of the OneTime appointment.
     */
    public void setYear(int newYear) {
        this.year = newYear; 
    }
    
    
	 /**
     * Get the year of the OneTime appointment.
     * 
     * @return the year
     */
    public int getYear() {
        return this.year;
    }

    
    /**
     * Check whether the OneTime appointment on the certain day in the certain month in the certain year
     * 
     * @return true if day, month, and year are all the same
     */
    public boolean occursOn(int year, int month, int day) {
    	if(this.getDay() == day && this.month == month && this.year == year) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    /**
     * Create a more elegant value for one-time appointment descriptions
     */
    public String toString() {
    	return "One-time Appointment: " + getAppointment();
    }
}
