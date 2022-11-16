package entity.player;

import engine.PlayerListener;
import entity.pieces.Color;

public class Player implements PieceListener{
	
	private Color color;
	private int remainingPieces;
	private PlayerListener listener;
	
	public Player(Color color, PlayerListener listener){
		
		this.color = color;
		this.listener = listener;
		
	}
	
	public Color getColor() {
		
		return this.color;
	}
	
	public void onPieceCaptured() {
		
	}
	
	public int remainingPieces() {
		
		return this.remainingPieces;
		
	}
	
	public PlayerListener getListener() {
		
		return this.listener;
	
	}
	
}
