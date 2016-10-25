/**
 * 
 */
package game.pieces;

/**
 * Defines the behavior for a general game piece.
 * 
 * @author benjamin.zich
 *
 */
public interface gamePiece {
	
	//Checks for valid move for the particular piece.
	public boolean isValidMove(int x, int y);
	

}
