package entity.pieces;

public class Location {
	
    private int row;
    private int col;
    
    public Location(int row, int col) {
    	
    	this.row = row;
    	this.col = col;
    }
    
    public boolean equals(Object obj){
    	
    	Location SS = (Location) obj;
    	if(this.getRow()==SS.getRow() && this.getColumn()==SS.getColumn()) {
    		return true;
    	}
    	else {
    	return false;
    	}
    }
    
    public int getRow(){
    	
    	return this.row;
    
    }
    
    public int getColumn(){
    	
    	return this.col;
    
    }
    
    public int setColumn(int a) {
    	
    	return this.col = a;
    	
    }
    
    public int setRow(int b) {
    	
    	return this.row = b;
    	
    }
}
