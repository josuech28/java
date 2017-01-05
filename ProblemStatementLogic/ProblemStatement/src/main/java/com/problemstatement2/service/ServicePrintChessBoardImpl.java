package com.problemstatement2.service;

import com.problemstatement2.model.ChessBoard;
import com.problemstatement2.model.ChessBoardSize;

import java.util.Arrays;

/**
 * Created by joschinc on 1/4/17.
 */
public class ServicePrintChessBoardImpl implements ServicePrintChessBoard {
    private ServiceFillChessBoard serviceFillChessBoard = new ServiceFillChessBoardImpl();

    public void printMatrix(ChessBoard chessBoard) {
        chessBoard = serviceFillChessBoard.fillChessBoard(chessBoard);
        for(char[] row: chessBoard.getChessBoard()){
            System.out.println(Arrays.toString(row));
        }
    }

}
