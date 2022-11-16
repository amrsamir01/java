package exception;

public class InvalidMoveException extends CheckersException {

	private static final long serialVersionUID = 1L;

	public InvalidMoveException() {
		
    }
    
  
    public InvalidMoveException(String errMsg) {
    	
        super(errMsg);
        
    }
}