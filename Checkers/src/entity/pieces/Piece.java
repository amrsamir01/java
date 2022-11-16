package entity.pieces;

import java.util.ArrayList;
import entity.player.PieceListener;
import entity.pieces.Location;

public abstract class Piece {
	
	private Location location;
	private Color color;
	private PieceListener listener;
	
    public Piece(Location location, Color color, PieceListener listener2){
    	
    	this.location = location;
    	this.color = color;
    	this.listener = listener;
    	
    }
    
    public Piece(int row, int col, Color color, PieceListener listener2) {
    	
		this.location = new Location(row,col);
		this.color = color;
		this.listener = listener;
		
	}

	public void captured(){
    	
    }
    
    public King upgrade(){
    	
    	return new King(this.location, this.color, this.listener);
    	
    }
    
    
    public void setLocation(Location b) {
    	
    	this.location = b;
    
    }
    
    public boolean equals(Object obj) {
    	if (this.getLocation().equals(((Piece) obj).getLocation())) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    public abstract ArrayList<Location> possibleMoves();
    
    public Location getLocation(){
    	return this.location;
    	
    }
    
    public Color getColor(){
    	
    	return this.color;
    	
    }
}
