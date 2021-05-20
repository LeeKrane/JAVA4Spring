package at.kradev.spring.working_hours.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
	public EmployeeNotFoundException () {
	}
	
	public EmployeeNotFoundException (String message) {
		super(message);
	}
}
