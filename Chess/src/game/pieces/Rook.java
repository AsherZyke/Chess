/**
 * 
 */
package game.pieces;

/**
 * @author benjamin.zich
 *
 */
public class Rook extends chessPiece {
	
	//Creates the Rook object
	public Rook( int x, int y, int color ) {
		setX( x );
		setY( y );
		setColor( color );
	}

	/* (non-Javadoc)
	 * @see game.pieces.gamePiece#isValidMove(int, int)
	 */
	@Override
	public boolean isValidMove(int x, int y) {
		if( ( getX() != x && getY() == y ) || ( getX() == x && getY() != y ) ) {
			return true;
		} else {
		    return false;
		}			
	}

}
