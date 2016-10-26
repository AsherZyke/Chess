package game.manager;

import game.board.ChessBoard;
import game.pieces.ChessPiece;
import static game.rules.Constants.*;

//Manages the logic of the game
public class Manager {
    //the game board
    private ChessBoard currentBoard;
    //player turn
    public int playerTurn = BLACK;
    
    //Creates the chess board
    public Manager() {
        currentBoard = new ChessBoard();
    }
    
    //Create move logic
    public boolean movePiece( int initialX, int initialY, int endX, int endY ) {
        ChessPiece pieceToMove = currentBoard.getSquareChessPiece(initialX, initialY);
        ChessPiece pieceAtEnd = currentBoard.getSquareChessPiece(endX, endY);
        
        if( pieceToMove == null ) {
            return false;
        }
        
        if( pieceToMove.getColor() == BLACK && playerTurn == WHITE || pieceToMove.getColor() == WHITE 
                && playerTurn == BLACK ) {
            return false;
        }
        //TOADD: castling functionality
        if( pieceAtEnd != null ) { 
            if( pieceToMove.getColor() == pieceAtEnd.getColor() ) {
                return false;
            }
        }
        
        if( pieceToMove.isValidMove(endX, endY) ) {
            currentBoard.setSquare(initialX, initialY, null);
            currentBoard.setSquare(endX, endY, pieceToMove);
            pieceAtEnd.flipIsTaken();
            if( playerTurn == BLACK ) {
                playerTurn = WHITE;
            } else {
                playerTurn = BLACK;
            }
            return true;
        }
        
        return false;
    }

}
