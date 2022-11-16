package engine;
import java.util.ArrayList;

import entity.pieces.Color;
import entity.pieces.King;
import entity.pieces.Location;
import entity.pieces.Pawn;
import entity.pieces.Piece;

public class Board{
	
	private int dimension;
	private ArrayList<Piece> pieces; 
		
	public Board(ArrayList<Piece> pieces,int d){
		this.dimension = d;
        this.pieces = pieces;
        
	}
	
	public Piece getPieceAt(Location location){
		
		for(int i = 0; i <= 12;i++) {
			if(this.pieces.get(i).getLocation().equals(location)) {
				
				return this.pieces.get(i);
			}
		}
		return null;
		
	}
	
	public ArrayList<Location> PossiblePlays(Piece piece){
		
		ArrayList<Location> possibleplays = new ArrayList<Location>();
		
		if(piece instanceof Pawn) {
			if(piece.getColor() == Color.GREEN) {
				
				Location moveupRight = new Location(piece.getLocation().getRow()-1,piece.getLocation().getColumn()+1);
				Location moveupLeft = new Location(piece.getLocation().getRow()-1,piece.getLocation().getColumn()-1);
				possibleplays.add(moveupLeft);
				possibleplays.add(moveupRight);
			}
			if(piece.getColor() == Color.RED) {
				
				Location movedownRight = new Location(piece.getLocation().getRow()+1,piece.getLocation().getColumn()+1);
				Location movedownLeft = new Location(piece.getLocation().getRow()+1,piece.getLocation().getColumn()-1);
				possibleplays.add(movedownRight);
				possibleplays.add(movedownLeft);
				
			}
		}
			
		if(piece instanceof King) {
			if(piece.getColor() == Color.GREEN) {
				
				Location moveupRight = new Location(piece.getLocation().getRow()-1,piece.getLocation().getColumn()+1);
				Location moveupLeft = new Location(piece.getLocation().getRow()-1,piece.getLocation().getColumn()-1);
				Location movedownRight = new Location(piece.getLocation().getRow()+1,piece.getLocation().getColumn()+1);
				Location movedownLeft = new Location(piece.getLocation().getRow()+1,piece.getLocation().getColumn()-1);
				possibleplays.add(movedownRight);
				possibleplays.add(movedownLeft);
				possibleplays.add(moveupLeft);
				possibleplays.add(moveupRight);
				
			}
			
		    if(piece.getColor() == Color.RED) {
		    	
		    	Location movedownRight = new Location(piece.getLocation().getRow()+1,piece.getLocation().getColumn()+1);
				Location movedownLeft = new Location(piece.getLocation().getRow()+1,piece.getLocation().getColumn()-1);
				Location moveupRight = new Location(piece.getLocation().getRow()-1,piece.getLocation().getColumn()+1);
				Location moveupLeft = new Location(piece.getLocation().getRow()-1,piece.getLocation().getColumn()-1);
				Location moveupRightCaptured = new Location(piece.getLocation().getRow()-2,piece.getLocation().getColumn()+2);
			    Location moveupLeftCaptured = new Location(piece.getLocation().getRow()-2,piece.getLocation().getColumn()-2);
				Location movedownRightCaptured = new Location(piece.getLocation().getRow()+2,piece.getLocation().getColumn()+2);
				Location movedownLeftCaptured = new Location(piece.getLocation().getRow()+2,piece.getLocation().getColumn()-2);
				possibleplays.add(movedownRight);
				possibleplays.add(movedownLeft);
				possibleplays.add(moveupLeft);
				possibleplays.add(moveupRight);
				possibleplays.add(moveupRightCaptured);
				possibleplays.add(moveupLeftCaptured);
				possibleplays.add(movedownRightCaptured);
				possibleplays.add(movedownLeftCaptured);
		    }
			
	        
		}
		return possibleplays;
		
	}
	
	public ArrayList<Piece> captureCapable(Color color){
		
		ArrayList<Piece> piecesCanCapture = new ArrayList<Piece>();
		return null;
	
	}
    
	public boolean movePiece(Piece piece, Location destination) {
		
		return true;
		
	}
	
	public boolean canMakeMove(Color color) {
		
		for(int i = 0;i<pieces.size();i++) {
			
			if(pieces.get(i).getColor()==Color.GREEN)
				return true;
		}
		return false;
	}
	public int dimension() {
		
		return this.dimension;
		
	}
}
