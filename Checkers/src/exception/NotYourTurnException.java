package exception;

public class NotYourTurnException extends CheckersException {
	
	private static final long serialVersionUID = 1L;

	public NotYourTurnException() {
		
    }

    public NotYourTurnException(String errMsg) {
    	
        super(errMsg);
        
    }
}