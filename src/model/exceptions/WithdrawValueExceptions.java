package model.exceptions;

public class WithdrawValueExceptions extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public WithdrawValueExceptions(String message) {
		super(message);
	}	
}
