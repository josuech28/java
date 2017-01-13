package com.action.player;

import com.action.Action;
import com.dao.DAO;
import com.dao.PlayerDaoImpl;
import com.model.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by joschinc on 1/9/17.
 */
public class ActionGetAllPlayer implements Action {
    private final ApplicationContext context;
    private final DAO<Player> playerDAO;
    private List<Player> players;

    public ActionGetAllPlayer(){
        this.context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
        this.playerDAO = (PlayerDaoImpl) context.getBean("playerDAO");
    }

    public List<Player> getPlayers(){
        return this.players;
    }
    @Override
    public void execute() {
        players = playerDAO.list();
    }
}
