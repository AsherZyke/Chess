/**
 * 
 */
package game.pieces;

/**
 * @author benjamin.zich
 *
 */
public abstract class chessPiece implements gamePiece {
	
	//Width of chess board
	public static final int chessBoardWidth = 8;
	//Height of chess board
	public static final int chessBoardHeight = 8;
	//Position on the x axis
	private int x;
	//Position on the y axis
	private int y;
	//Whether the piece has been taken
	private boolean isTaken;
	
	//Gets x coordinate
	public int getX(){
		return x;
	}
	
	//Gets y coordinate
	public int getY(){
		return y;
	}
	
	//Sets x coordinate
	public void setX( int x ) {
		if ( !isValidInput( x ) ) {
			throw new IllegalArgumentException( "Invalid x coordinate" );
		}
		this.x = x;
	}
	
	//Sets y coordinate
	public void setY( int y ) {
		if ( !isValidInput( y ) ) {
			throw new IllegalArgumentException( "Invalid y coordinate" );
		}
		this.y = y;
	}
	
	private boolean isValidInput( int i ) {
		if( i <= 8 && i >= 1 ) {
			return true;
		} else {
			return false;
		}
	}
	
}
