package exercises.io.file.buffer;

import java.io.*;

/**
 * Created by joschinc on 11/9/16.
 */
public class KeyWordSearchTest {

    private String path = "/Users/joschinc/Desktop/example.txt";
    private Reader reader = null;

    public boolean findKey(String key){
        boolean find = false;
        try{
            reader = new BufferedReader(new FileReader(path));
            int readBytes = 0;
            char[] buffer = new char[2048];
            while((readBytes = reader.read(buffer)) != -1 ){
                String output = new String(buffer, 0, readBytes);
                if(output.contains(key)){
                    System.out.println(key +" Key find in the file...");
                    find = true;
                } else {
                    System.out.println(key +" Key not found in the file...");
                }
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return find;
    }

}
