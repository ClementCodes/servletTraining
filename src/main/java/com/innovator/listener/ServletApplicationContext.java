package com.innovator.listener;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.innovator.model.Personne2;

/**
 * Application Lifecycle Listener implementation class Listen1
 *
 */
@WebListener
public class ServletApplicationContext implements ServletContextListener {

    /**
     * Default constructor.
     */
    public ServletApplicationContext() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        Personne2 p1 = new Personne2("aa", "bb", 10);
        Personne2 p2 = new Personne2("Caa", "Ebb", 17);
        Personne2 p3 = new Personne2("Daa", "Fbb", 34);

        ArrayList<Personne2> list = new ArrayList<Personne2>();
        list.add(p1);
        list.add(p2);
        list.add(p2);

        arg0.getServletContext().setAttribute("listeServiceApplication", list);
    }

}
