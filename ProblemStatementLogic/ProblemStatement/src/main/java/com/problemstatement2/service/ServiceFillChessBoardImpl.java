package com.problemstatement2.service;

import com.problemstatement2.model.ChessBoard;
import com.problemstatement2.model.ChessBoardSize;

/**
 * Created by joschinc on 1/4/17.
 */
public class ServiceFillChessBoardImpl implements ServiceFillChessBoard {
    public ChessBoard fillChessBoard(ChessBoard chessBoard){
        int size = chessBoard.getChessBoardSize().getSize();
        ChessBoardSize chessBoardSize = new ChessBoardSize(size);
        char[][] generatedChessBoard = createChessBoard(chessBoardSize);
        generatedChessBoard[0][0] = 'W';

        for(int row = 0; row < generatedChessBoard.length; row++) {
            for (int column = 0; column < generatedChessBoard.length; column++) {
                if(column != generatedChessBoard.length - 1){
                    if(generatedChessBoard[row][column] == 'W'){
                        generatedChessBoard[row][column + 1] = 'B';
                    } else {
                        generatedChessBoard[row][column + 1] = 'W';
                    }
                } else {
                    if(column == generatedChessBoard.length - 1){
                        if(row < generatedChessBoard.length - 1) {
                            if (generatedChessBoard[row][column] == 'W') {
                                generatedChessBoard[row + 1][0] = 'B';
                            } else {
                                generatedChessBoard[row + 1][0] = 'W';
                            }
                        }
                    }
                }
            }
        }

        return new ChessBoard(chessBoardSize,generatedChessBoard);
    }

    private char[][] createChessBoard(ChessBoardSize chessBoardSize){
        int size = chessBoardSize.getSize();
        char[][] chessboard = new char[size][size];
        return chessboard;
    }
}
