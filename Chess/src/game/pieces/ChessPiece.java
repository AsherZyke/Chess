/**
 * 
 */
package game.pieces;

/**
 * @author benjamin.zich
 *
 */
public abstract class ChessPiece implements gamePiece {
	
	//Position on the x axis
	private int x;
	//Position on the y axis
	private int y;
	//Whether the piece has been taken
	private boolean isTaken;
	//Color
	private int color;
	
	
	public ChessPiece( int x, int y, int color ) {
	    this.x = x;
	    this.y = y;
	    this.color = color;
	}
	//Gets x coordinate
	public int getX(){
		return x;
	}
	
	//Gets y coordinate
	public int getY(){
		return y;
	}
	
	//Gets the piece's color
	public int getColor() {
	    return color;
	}
	
	//Checks to see if the piece is taken
	public boolean checkIfTaken() {
	    return isTaken;
	}
	
	//Moves the chess piece
	public void movePiece( int x, int y ) {
		if ( isValidMove(x, y) ) {
			setX( x );
			setY( y );
		} else {
			throw new IllegalArgumentException( "Invalid movement order ");
		}
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
	
	//Checks to see if the game piece is moved off the board
	private boolean isValidInput( int i ) {
		if( i <= 8 && i >= 1 ) {
			return true;
		} else {
			return false;
		}
	}
	
	//If piece is taken then sets to true, if pawn reaches end of 
	//board then it can be flipped to false again.
	public void flipIsTaken() {
	    if ( isTaken ) {
	    	isTaken = false;
	    } else {
	    	isTaken = true;
	    }
	}
	
	//Sets color, 1 if white, 0 if black
	public void setColor( int i ) {
		if ( i > 1 || i < 0 ) {
			throw new IllegalArgumentException( "Invalid color" );
		}
		color = i;
	}
}
