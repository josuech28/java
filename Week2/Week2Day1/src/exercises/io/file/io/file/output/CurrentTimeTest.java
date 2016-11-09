package exercises.io.file.io.file.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by joschinc on 11/9/16.
 */
public class CurrentTimeTest {
    private OutputStream out = null;
    private CurrentTime ct;
    private String path = "/Users/joschinc/Desktop/example.txt";

    public CurrentTimeTest() {
       this.ct = new CurrentTime();
    }

    public void writeFile(){
        try{
            out = new FileOutputStream(path);
            byte[] contentInBytes = ct.getCurrentTime().getBytes();
            out.write(contentInBytes);
            out.flush();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                out.close();
                System.out.println("Finish....");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
