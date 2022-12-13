package appointment;

import java.util.Scanner;

/**
 * Aim to have the user enter a date and to print out all appointments
 * that occur on that date.
 * 
 * @author Zimeng Liu
 * @author Dickinson College
 * @version Dec 10, 2022
 */
public class AppointmentDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Appointment[] appointmentList = new Appointment[5];
		
		/**
		 * Create new appointments with types of Daily, Monthly, and OneTime.
		 */
		Daily daily1 = new Daily("studying GRE");
		Monthly monthly1 = new Monthly("QR meeting", 6);
		Monthly monthly2 = new Monthly("Issei", 17);
		OneTime oneTime1 = new OneTime("Nanzan Exchange", 2022, 11, 17);
		OneTime oneTime2 = new OneTime("Dentist", 2022, 12, 6);
		
		/**
		 * Fill the appointments into an array.
		 */
		appointmentList[0] = daily1;
		appointmentList[1] = monthly1;
		appointmentList[2] = monthly2;
		appointmentList[3] = oneTime1;
		appointmentList[4] = oneTime2;
		
		/**
	     * Get the valid year, month, and day from the user.
	     */
		System.out.print("Enter a year:");
		int year = input.nextInt();
		System.out.print("Enter a month:");
		int month = input.nextInt();
		if (month < 1 || month > 12) {
			System.out.print("Please enter a valid month:");
			month = input.nextInt();
		}
		System.out.print("Enter a day:");
		int day = input.nextInt();
		if (month == 2) {
			if (day < 0 || day > 28) {
				System.out.print("Please enter a valid day:");
				day = input.nextInt();
				}
			}else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
				if (day < 0 || day > 30) {
					System.out.print("Please enter a valid day:");
					day = input.nextInt();
					}
				}
		/**
		 * Print out all appointments that occur on that date.
		 */
		System.out.println("You have the following appointments on " + month + "/" + day + "/" + year + ":");

		for (int i = 0; i < 5; i++) {
			if (appointmentList[i].occursOn(year, month, day) == true) {
				System.out.println(appointmentList[i].toString());
			}
		}
	}
}

