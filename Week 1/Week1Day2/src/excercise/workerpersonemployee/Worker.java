package excercise.workerpersonemployee;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by joschinc on 11/2/16.
 */
public interface Worker {

    public abstract BigDecimal getSalary();

    public abstract Date getJoiningDate();
}
