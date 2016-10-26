/**
 * 
 */
package game.board;

import game.pieces.Bishop;
import game.pieces.ChessPiece;
import game.pieces.King;
import game.pieces.Knight;
import game.pieces.Pawn;
import game.pieces.Queen;
import game.pieces.Rook;
import static game.rules.Constants.*;

/**
 * @author benjamin.zich
 *
 */
public class ChessBoard {
    //Width of chess board
    public static final int chessBoardWidth = 8;
    //Height of chess board
    public static final int chessBoardHeight = 8;
    //The chess board to use for this game
    private static Square[][] thisChessBoard;
    
    //Creates a chessBoard object.
    public ChessBoard() {
        int spaceColor = WHITE;
        
        thisChessBoard = new Square[chessBoardWidth][chessBoardHeight];
        for( int i = 0; i < chessBoardWidth; i++ ) {
            for( int t = 0; i < chessBoardHeight; i++) {
                thisChessBoard[i][t] = new Square( spaceColor, null );
                if( spaceColor == WHITE ) {
                    spaceColor = BLACK;
                } else {
                    spaceColor = WHITE;
                }
            }
        }
    }
    
    //Creates a new game by clearing the board state and placing game pieces
    public void newGame() {
        emptyBoard();
        setBoard();
    }
    
    //Resets the board to empty
    private void emptyBoard() {
        for( int i = 0; i < thisChessBoard.length; i++ ) {
            for( int t = 0; t < thisChessBoard[i].length; t++) {
                thisChessBoard[i][t].currentPiece = null;
            }
        }
    }
    
    //Sets the initial gameboard state.
    private void setBoard() {
        
        //Places new black pawns
        for( int i = 0; i < chessBoardWidth; i++) {
            thisChessBoard[1][i].currentPiece = new Pawn( 1, i, BLACK ); 
        }
        //Places new white pawns
        for( int i = 0; i < chessBoardWidth; i++) {
            thisChessBoard[6][i].currentPiece = new Pawn( 1, i, WHITE ); 
        }
        //Places new black rooks
        thisChessBoard[0][0].currentPiece = new Rook( 0, 0, BLACK );
        thisChessBoard[0][7].currentPiece = new Rook( 0, 7, BLACK );
        //Places new white rooks
        thisChessBoard[7][0].currentPiece = new Rook( 7, 0, WHITE );
        thisChessBoard[7][7].currentPiece = new Rook( 7, 7, WHITE );
        //Places new black bishops
        thisChessBoard[0][1].currentPiece = new Bishop( 0, 1, BLACK );
        thisChessBoard[0][6].currentPiece = new Bishop( 0, 6, BLACK );
        //Places new white bishops
        thisChessBoard[7][1].currentPiece = new Bishop( 7, 1, WHITE );
        thisChessBoard[7][6].currentPiece = new Bishop( 7, 6, WHITE );
        //Places new black knights
        thisChessBoard[0][2].currentPiece = new Knight( 0, 2, BLACK );
        thisChessBoard[0][5].currentPiece = new Knight( 0, 5, BLACK );
        //Places new white knights
        thisChessBoard[7][2].currentPiece = new Knight( 7, 2, WHITE );
        thisChessBoard[7][5].currentPiece = new Knight( 7, 5, WHITE );
        //Places new black queen
        thisChessBoard[0][4].currentPiece = new Queen( 0, 4, BLACK );
        //Places new white queen
        thisChessBoard[7][3].currentPiece = new Queen( 7, 3, WHITE );
        //Places new black king
        thisChessBoard[0][3].currentPiece = new King( 0, 3, BLACK );
        //Places new white king
        thisChessBoard[7][4].currentPiece = new King( 7, 4, WHITE );
    }
    
    //Gets the current game state
    public Square[][] getGameState() {
        return thisChessBoard;
    }
    
    //Changes the chess piece on a square
    public void setSquare( int x, int y, ChessPiece newPiece ) {
        thisChessBoard[x][y].currentPiece = newPiece;
    }
    
    //Gets a square
    public Square getSquare( int x, int y) {
        return thisChessBoard[x][y];
    }
    
    //Gets chess piece associated with square
    public ChessPiece getSquareChessPiece( int x, int y ) {
        return getSquare( x, y).getChessPiece();
    }
    
    //Get a square's color
    public int getSquareColor( int x, int y ) {
        return thisChessBoard[x][y].color;
    }
    
    
    //Defines the state of each square
    private class Square {
        int color;
        ChessPiece currentPiece;
        
        private Square( int color, ChessPiece currentPiece) {
            this.color = color;
            this.currentPiece = currentPiece;
        }
        
        //gets the chess piece on the square
        private ChessPiece getChessPiece() {
            return currentPiece;
        }
    }

}
