package enums.behaviors;

public class SignatureException extends Exception {
	
	private static final long serialVersionUID = 7718828512143293558L;
	
	public SignatureException(String message) {
		super(message);
	}
	
	public SignatureException(String message, Throwable cause) {
		super(message, cause);
	}
}
