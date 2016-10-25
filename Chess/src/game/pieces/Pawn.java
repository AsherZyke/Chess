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
public class Pawn extends chessPiece {

	//Creates a pawn
	public Pawn(int x, int y, int color) {
		setX( x );
		setY( y );
		setColor( color );
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
