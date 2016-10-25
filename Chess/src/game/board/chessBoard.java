/**
 * 
 */
package game.board;

import game.pieces.chessPiece;

/**
 * @author benjamin.zich
 *
 */
public class chessBoard {
    //Width of chess board
    public static final int chessBoardWidth = 8;
    //Height of chess board
    public static final int chessBoardHeight = 8;
    //The chess board to use for this game
    private static Square[][] thisChessBoard;
    
    //Creates a chessBoard object.
    public chessBoard() {
        thisChessBoard = new Square[chessBoardWidth][chessBoardHeight];
        for( int i = 0; i < chessBoardWidth; i++ ) {
            for( int t = 0; i < chessBoardHeight; i++) {
                //to add - the logic that will initialize the pieces to null
                //and alternate the colors of the squares.
            }
        }
    }
    
    //Defines the state of each square
    private class Square {
        int color;
        chessPiece currentPiece;
        
        private Square( int color, chessPiece currentPiece) {
            this.color = color;
            this.currentPiece = currentPiece;
        }
    }

}
