package com.action.player;

import com.action.Action;
import com.dao.DAO;
import com.dao.LeagueDAOImpl;
import com.dao.PlayerDaoImpl;
import com.model.League;
import com.model.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by joschinc on 12/30/16.
 */
public class ActionUpdatePlayer implements Action {
    private final ApplicationContext context;
    private final DAO<Player>  playerDAO;
    private final Player player;

    public ActionUpdatePlayer(Player player){
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.playerDAO = (PlayerDaoImpl) context.getBean("playerDAO");
        this.player = player;
    }
    @Override
    public void execute(){
        playerDAO.update(player);
    }
}
