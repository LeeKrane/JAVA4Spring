package at.kradev.spring.working_hours.exceptions;

public class WorkingHoursHasIdException extends RuntimeException {
	public WorkingHoursHasIdException () {
	}
	
	public WorkingHoursHasIdException (String message) {
		super(message);
	}
}
