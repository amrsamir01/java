package exception;

public class CheckersException extends Exception{
    
	private static final long serialVersionUID = 1L;

	public CheckersException() {
		
    }
    
    public CheckersException(String errMsg) {
    	
        super(errMsg);
        
    }
}