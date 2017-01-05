import com.problemstatement2.model.ChessBoard;
import com.problemstatement2.model.ChessBoardSize;
import com.problemstatement2.service.ServicePrintChessBoard;
import com.problemstatement2.service.ServicePrintChessBoardImpl;
import com.problemstatement2.util.Validator;

import java.util.Scanner;


/**
 * Created by joschinc on 1/4/17.
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 100;
        Validator validator = new Validator();
        System.out.println("Hello, please select the size to the cheesboard! (Need to be more than 0 and less or equal than 100)");
        int size = sc.nextInt();
        if(validator.isNumberValid(min,max,size)){
            ServicePrintChessBoard service = new ServicePrintChessBoardImpl();
            ChessBoardSize chessBoardSize = new ChessBoardSize(size);
            char[][] charArray = new char[chessBoardSize.getSize()][chessBoardSize.getSize()];
            ChessBoard chessBoard = new ChessBoard(chessBoardSize,charArray);
            System.out.println("This is your chessboard!");
            service.printMatrix(chessBoard);
        } else {
            System.out.println("Size is not supported!");
        }
    }
}
