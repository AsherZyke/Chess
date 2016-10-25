/**
 * 
 */
package game.pieces;

/**
 * @author benjamin.zich
 *
 */
public class Bishop extends chessPiece {
    
    //Creates the Bishop object
    public Bishop( int x, int y, int color ){
        setX( x );
        setY( y );
        setColor( color );
    }

    /* (non-Javadoc)
     * @see game.pieces.gamePiece#isValidMove(int, int)
     */
    @Override
    public boolean isValidMove(int x, int y) {
        if( Math.abs( getX() - x ) - Math.abs( getY() - y ) == 0 ){
            return true;
        } else {
            return false;
        }
    }
}
