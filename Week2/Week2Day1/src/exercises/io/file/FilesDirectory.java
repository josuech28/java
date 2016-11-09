package exercises.io.file;

import java.io.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by joschinc on 11/9/16.
 */
public class FilesDirectory {
    private Map<String,String> results;
    private File[] files;


    public FilesDirectory(){
        this.results = new HashMap<String,String>();
        this.files = new File("/Users/joschinc/Desktop").listFiles();
    }

    public void fillDirectory(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        for(File file: files){
            results.put(file.getName(),sdf.format(file.lastModified()));
        }
    }
    public  void printResult(){
        Set<Map.Entry<String,String>> keySet = results.entrySet();
        for(Map.Entry<String,String> element: keySet){
            System.out.println(element.toString());
        }
    }
}
