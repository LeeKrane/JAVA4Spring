package at.kradev.spring.working_hours.exceptions;

public class WorkingHoursNotFoundException extends RuntimeException {
	public WorkingHoursNotFoundException () {
	}
	
	public WorkingHoursNotFoundException (String message) {
		super(message);
	}
}
