package at.kradev.spring.labor14_num2.exceptions;

public class UserHasNoPostsException extends RuntimeException {
	public UserHasNoPostsException () {
	}
	
	public UserHasNoPostsException (String message) {
		super(message);
	}
}
