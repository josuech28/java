package exercises.io.file.charcount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by joschinc on 11/9/16.
 */
public class CharCount {

    private String path = "CountCharacter.txt";
    private InputStream inputStream = null;

    public int getCountChar(){
        int charCount = 0;
        try {
            inputStream = new FileInputStream(path);

            int data = inputStream.read();

            while(data != -1){
                data = inputStream.read();
                charCount++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return charCount;
    }
}
