/**
 * 
 */
package game.pieces;

/**
 * @author benjamin.zich
 *
 */
public class Bishop extends ChessPiece {
    
    //Creates the Bishop object
    public Bishop( int x, int y, int color ){
        super( x, y, color);
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
