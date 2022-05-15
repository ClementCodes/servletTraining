package com.innovator.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebServlet;

import com.innovator.model.Personne2;

import java.util.ArrayList;

@WebServlet("/servletapplication")
public class ServletApplication implements ServletContextListener {

    /**
     * Default constructor.
     */
    public ServletApplication() {
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
        // System.out.println("coucou");
        // TODO Auto-generated method stub
        Personne2 p1 = new Personne2("nom1", "preno1", 12);
        Personne2 p2 = new Personne2("nom2", "prenom2", 34);
        Personne2 p3 = new Personne2("nom3", "prenom3", 43);

        ArrayList<Personne2> list = new ArrayList<Personne2>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        // getservlettcontext synonyme de getAppplication
        arg0.getServletContext().setAttribute("listePersonnes", list);

    }

}
