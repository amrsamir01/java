package entity.pieces;

import java.util.ArrayList;
import entity.player.PieceListener;

public class King extends Piece{

    public King(Location location, Color color, PieceListener listener){
    	super(location, color, listener);
    }
    
    public King(int row, int col, Location location, Color color, PieceListener listener){
    	super(row, col, color, listener);
    }
    
    public ArrayList<Location> possibleMoves(){
    	
        ArrayList<Location> empty= new ArrayList<Location>();
    	if(this.getColor() == Color.GREEN){
    		Location diagonalupRight = new Location(this.getLocation().getRow()-1, this.getLocation().getColumn()+1);
    		if(diagonalupRight.getRow() < 8 && diagonalupRight.getRow() >= 0 && diagonalupRight.getColumn()>8 &&diagonalupRight.getColumn()<=0){
    			empty.add(diagonalupRight);
    		}
    	    Location diagonalupLeft = new Location(this.getLocation().getRow()-1, this.getLocation().getColumn()-1);
    		if(diagonalupLeft.getRow() < 8 && diagonalupLeft.getRow() >= 0 && diagonalupLeft.getColumn()>8 &&diagonalupLeft.getColumn()<=0){
    			empty.add(diagonalupLeft);
    		}
    		Location diagonaldownRight = new Location(this.getLocation().getRow()+1, this.getLocation().getColumn()+1);
    		if(diagonaldownRight.getRow() < 8 && diagonaldownRight.getRow() >= 0 && diagonaldownRight.getColumn()>8 &&diagonaldownRight.getColumn()<=0){
    			empty.add(diagonaldownRight);
    		}
    	    Location diagonaldownLeft = new Location(this.getLocation().getRow()+1, this.getLocation().getColumn()-1);
    		if(diagonaldownLeft.getRow() < 8 && diagonaldownLeft.getRow() >= 0 && diagonaldownLeft.getColumn()>8 &&diagonaldownLeft.getColumn()<=0){
    			empty.add(diagonaldownLeft);
    		}
	    }
    	if(this.getColor() == Color.RED){
    		Location diagonalupRight = new Location(this.getLocation().getRow()-1, this.getLocation().getColumn()+1);
    		if(diagonalupRight.getRow() < 8 && diagonalupRight.getRow() >= 0 && diagonalupRight.getColumn()>8 &&diagonalupRight.getColumn()<=0){
    			empty.add(diagonalupRight);
    		}
    	    Location diagonalupLeft = new Location(this.getLocation().getRow()-1, this.getLocation().getColumn()-1);
    		if(diagonalupLeft.getRow() < 8 && diagonalupLeft.getRow() >= 0 && diagonalupLeft.getColumn()>8 &&diagonalupLeft.getColumn()<=0){
    			empty.add(diagonalupLeft);
    		}
    		Location diagonaldownRight = new Location(this.getLocation().getRow()+1, this.getLocation().getColumn()+1);
    		if(diagonaldownRight.getRow() < 8 && diagonaldownRight.getRow() >= 0 && diagonaldownRight.getColumn()>8 &&diagonaldownRight.getColumn()<=0){
    			empty.add(diagonaldownRight);
    		}
    	    Location diagonaldownLeft = new Location(this.getLocation().getRow()+1, this.getLocation().getColumn()-1);
    		if(diagonaldownLeft.getRow() < 8 && diagonaldownLeft.getRow() >= 0 && diagonaldownLeft.getColumn()>8 &&diagonaldownLeft.getColumn()<=0){
    			empty.add(diagonaldownLeft);
    		}
    	}
    	return null;
    }	
    public boolean equals(Location obj,Color obj1) {
    	if((this.getColor().equals(obj1))&&this.getLocation().equals(obj)) {
    		return true;
    	}
    	
    	else {
    		return false;
    	}
    		
    }
}