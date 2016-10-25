/**
 * 
 */
package game.pieces;

/**
 * Defines the behavior of the queen piece.
 * 
 * @author benjamin.zich
 *
 */
public class Queen extends chessPiece {
	
	//Creates the Queen object
	public Queen( int x, int y, int color ) {
		setX( x );
		setY( y );
		setColor( color );
	}

	/* (non-Javadoc)
	 * @see game.pieces.gamePiece#isValidMove(int, int)
	 */
	@Override
	public boolean isValidMove(int x, int y) {
		int xNow = getX();
		int yNow = getY();
		if( ( xNow != x && yNow == y) || ( yNow != y && xNow == x ) 
				|| ( ( Math.abs( xNow - x ) - Math.abs( yNow - y ) ) == 0 ) ) {
			return true;
		} else {
		    return false;
		}
	}
}
