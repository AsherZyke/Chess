/**
 * 
 */
package game.pieces;

/**
 * Defines the behavior of a pawn chess piece.
 * 
 * @author benjamin.zich
 *
 */
public class Pawn extends ChessPiece {

	//Creates a pawn
	public Pawn(int x, int y, int color) {
		super( x, y, color);
	}
	
	/* (non-Javadoc)
	 * @see game.pieces.gamePiece#isValidMove(int, int)
	 */
	@Override
	public boolean isValidMove(int x, int y) {
		if ( getY() == y + 1 || getY() == y - 1) {
			return true;
		} else {
			return false;
		}
	}

}
