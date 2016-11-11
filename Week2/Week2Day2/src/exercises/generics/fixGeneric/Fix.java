package exercises.generics.fixGeneric;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joschinc on 11/11/16.
 */
public class Fix {
    public static void main(String[] args){

        List<Object> matrix = new ArrayList<Object>();

        for(int i = 0; i <= 10; i++){
            List<Object> row = new ArrayList<Object>();
            for(int j = 0; j <= 10; j++) {
                row.add(i*j);
            }
            matrix.add(row);
        }
        for(int i = 0; i < matrix.size(); i++){
            System.out.println(matrix.get(i));
        }
    }

}

