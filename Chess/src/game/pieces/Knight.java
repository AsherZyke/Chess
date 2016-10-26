/**
 * 
 */
package game.pieces;

/**
 * @author benjamin.zich
 *
 */
public class Knight extends ChessPiece {
    
    //Creates the Knight object
    public Knight( int x, int y, int color ) {
        super( x, y, color);
    }

    /* (non-Javadoc)
     * @see game.pieces.gamePiece#isValidMove(int, int)
     */
    @Override
    public boolean isValidMove(int x, int y) {
        if( ( Math.abs( getX() - x ) == 2 && (Math.abs( getY() - y ) ) == 1 ) 
                || ( Math.abs( getX() - x ) == 1) && ( Math.abs( getY() - y )  == 2 ) ) {
            return true;
        } else {
            return false;
        }
    }

}
