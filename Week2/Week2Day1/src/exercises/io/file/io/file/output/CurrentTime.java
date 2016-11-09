package exercises.io.file.io.file.output;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by joschinc on 11/9/16.
 */
public class CurrentTime {

    private Date currentTime;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public String getCurrentTime() {
        return sdf.format(currentTime);
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public CurrentTime(){
        this.currentTime = new Date();
    }
}
