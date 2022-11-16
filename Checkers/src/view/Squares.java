package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import engine.Board;
import engine.Game;
import entity.pieces.Location;
import entity.pieces.Piece;

public class Squares extends JFrame {
	public Squares() {
	}

	private static final long serialVersionUID = 1L;
	
	Piece piece;
	Location location;
	Board board;
	GameListener listener;
	Game game;
	Color color;
	
	public static void main (String[] args)  { 
		
		JFrame frame = new JFrame ();
		JPanel panel = new JPanel(new GridLayout(8,8));
		JButton[][] button= new JButton[8][8];
		
		for(int i = 0; i < 8; i++) {
			
			for(int j = 0; j < 8; j++) {
				
				button[i][j]= new JButton();
				
				if((i+j)%2 == 0) {
					
					button[i][j].setBackground(Color.BLACK);
					
					if((i==2)||(i==0)||(i==1 && j==1)||(i==1 && j==3)||(i==1 && j==5)||(i==1 && j==7)) {
						
						JButton button2 = new JButton();
					    button2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
					    button2.setBackground(Color.RED);
					    button[i][j].add(button2);
					    panel.add(button[i][j]);
					
					}
					if((i==5)||(i==7)||(i==6 && j==0)||(i==6 && j==2)||(i==6 && j==4)||(i==6 && j==6)) {
						
						JButton button2 = new JButton();
						button2.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
						button2.setBackground(Color.GREEN);
						button[i][j].add(button2);
						panel.add(button[i][j]);
						
						}
				}
				if((i+j)%2==1) {
					
					button[i][j].setBackground(Color.WHITE);
					
				}
				
				panel.add(button[i][j]);
				
			} 
		}
			
			frame.setTitle("Checkers");
			frame.getContentPane().add(panel);
			frame.setVisible(true);
			frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			//frame.setBackground(null);
            //frame.getContentPane().add(frame, new Squares());
            //frame.setSize(1000, 1000);
	}

}