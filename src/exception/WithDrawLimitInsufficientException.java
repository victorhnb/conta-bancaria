package exception;

public class WithDrawLimitInsufficientException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public WithDrawLimitInsufficientException(String msg) {
		super(msg);
	}
}
