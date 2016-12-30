import com.dao.DAO;
import com.dao.LeagueDAOImpl;
import com.model.League;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by joschinc on 12/30/16.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("ApplicationContext.xml");

        DAO<League>  leagueDAO = (LeagueDAOImpl) context.getBean("leagueDAO");

    }
}
