package com.test;

import com.sun.jndi.toolkit.url.Uri;
import com.sun.org.apache.bcel.internal.util.ClassLoader;
import com.sun.org.apache.xpath.internal.operations.Plus;
import com.test.playerteam.PlayerSoccer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;
import java.net.URL;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
        String xmlFile = "applicationContext.xml";

        System.out.println(xmlFile);
        ApplicationContext context = new FileSystemXmlApplicationContext(xmlFile);

        Player player = (Player)context.getBean("playerBean", Player.class);
        player.displayInfo();

        PlayerSoccer playerSoccer = (PlayerSoccer) context.getBean("playerSoccerBean",PlayerSoccer.class);
        playerSoccer.displayInfo();
    }
}
