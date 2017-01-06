package com.problemstatement2.model;

import java.util.Arrays;

/**
 * Created by joschinc on 1/3/17.
 */
public class ChessBoard {
    private final ChessBoardSize chessBoardSize;
    private final char[][] chessBoard;


    public ChessBoard(ChessBoardSize chessBoardSize,char[][] chessBoard) {
        this.chessBoardSize = chessBoardSize;
        this.chessBoard = chessBoard;
    }

    public ChessBoardSize getChessBoardSize() {
        return chessBoardSize;
    }

    public char[][] getChessBoard() {
        return chessBoard;
    }

}
