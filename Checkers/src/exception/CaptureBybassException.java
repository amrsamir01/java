package exception;

public class CaptureBybassException extends CheckersException {
        
	private static final long serialVersionUID = 1L;

	public CaptureBybassException() {
    	
    }
    
    public CaptureBybassException(String errMsg) {
    	
        super(errMsg);
        
    }
}
