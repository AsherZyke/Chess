/**
 * 
 */
package game.pieces;

/**
 * Defines the behavior of the king piece.
 * @author benjamin.zich
 *
 */
public class King extends chessPiece {
	
	//Creates a king
	public King ( int x, int y, int color ) {
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
		
		if ( Math.abs( xNow + yNow - x - y ) == 1 ){
			return true;
		} else {
			return false;
		}
	}

}
