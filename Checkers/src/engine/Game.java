package engine;
import java.util.ArrayList;

import entity.pieces.Color;
import entity.pieces.Location;
import entity.pieces.Pawn;
import entity.pieces.Piece;
import entity.player.Player;
import exception.CaptureBybassException;
import exception.CheckersException;
import exception.InvalidMoveException;
import exception.NotYourTurnException;
import view.GameListener;

public class Game implements GameListener {
	
	Player currentPlayer;
	Player opponentPlayer;
	Board board;
	GameListener listener;
	private final int DIMENSION = 8;
	
	public Game(GameListener listener) {
		
		this.listener = listener;
		
	}
	
    public Player getCurrentPlayer() {
		
		return this.currentPlayer;
		
	}
	
	public Player getOpponentPlayer() {
		
		return this.opponentPlayer;
		
	}
	
	public int getDimension() {
		
		return this.DIMENSION;
		
	}
	
	
	public ArrayList<Piece> getPieces(){
		ArrayList<Piece> BBBB = new ArrayList<Piece>();
		Pawn piece_currentPlayer_1 = new Pawn(7,1,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_1);
		Pawn piece_currentPlayer_2 = new Pawn(6,2,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_2);
		Pawn piece_currentPlayer_3 = new Pawn(8,2,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_3);
		Pawn piece_currentPlayer_4 = new Pawn(7,3,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_4);
		Pawn piece_currentPlayer_5 = new Pawn(6,4,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_5);
		Pawn piece_currentPlayer_6 = new Pawn(8,4,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_6);
		Pawn piece_currentPlayer_7 = new Pawn(7,5,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_7);
		Pawn piece_currentPlayer_8 = new Pawn(6,6,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_8);
		Pawn piece_currentPlayer_9 = new Pawn(8,6,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_9);
		Pawn piece_currentPlayer_10 = new Pawn(7,7,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_10);
		Pawn piece_currentPlayer_11 = new Pawn(6,8,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_11);
		Pawn piece_currentPlayer_12 = new Pawn(8,8,Color.GREEN,currentPlayer);
		BBBB.add(piece_currentPlayer_12);
		Pawn piece_opponentPlayer_1 = new Pawn(1,1,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_1);
		Pawn piece_opponentPlayer_2 = new Pawn(2,1,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_2);
		Pawn piece_opponentPlayer_3 = new Pawn(2,2,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_3);
		Pawn piece_opponentPlayer_4 = new Pawn(3,3,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_4);
		Pawn piece_opponentPlayer_5 = new Pawn(1,3,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_5);
		Pawn piece_opponentPlayer_6 = new Pawn(2,4,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_6);
		Pawn piece_opponentPlayer_7 = new Pawn(3,5,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_7);
		Pawn piece_opponentPlayer_8 = new Pawn(1,5,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_8);
		Pawn piece_opponentPlayer_9 = new Pawn(2,6,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_9);
		Pawn piece_opponentPlayer_10 = new Pawn(3,7,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_10);
		Pawn piece_opponentPlayer_11 = new Pawn(1,7,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_11);
		Pawn piece_opponentPlayer_12 = new Pawn(2,8,Color.RED,opponentPlayer);
		BBBB.add(piece_currentPlayer_12);
		return BBBB;
	}
	
	public void Play(Piece piece, Location destination) throws CheckersException {
		if ( currentPlayer.getColor()!=piece.getColor()) {
	        throw new NotYourTurnException("That is not your Turn");
	    }

	    if (board.captureCapable(currentPlayer.getColor()).size() > 0 && board.captureCapable(currentPlayer.getColor()).indexOf(piece) == -1) {
	        throw new CaptureBybassException("That cannot be Captured");

	    }

	    if (board.PossiblePlays(piece).indexOf(destination) == -1) {
	        throw new InvalidMoveException("Not possible Move");

	    }

	    else {
	        piece.setLocation(destination);
	        endTurn();
	    }
	}
	private void endTurn() {
		
		Player temp = currentPlayer;
		currentPlayer = opponentPlayer;
		opponentPlayer = temp;
		
	}

	@Override
	public void Gameover(Color winner) {
		// TODO Auto-generated method stub
		
	}
	
}

