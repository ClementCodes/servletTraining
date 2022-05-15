package com.innovator;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.innovator.Dao.DaoPersonne;

import com.innovator.model.Personne;

@WebServlet("/servletpersonne")
public class ServletPersonne extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        DaoPersonne d = new DaoPersonne();

        try {
            ArrayList<Personne> lst = d.select();
            request.setAttribute("x", lst);

        } catch (Exception e) {

            System.out.println(e.toString());
        }

        // ----ici un test en priorite pour savoir si le dispatch part bien ou je le
        // souaite
        // pour avoir acces au page via le dispatcher et donc le servlet il faut que le
        // fichier se trouve dans dans webinf ici via l url via le service
        // http://localhost:8080/project_servlet/api configure dans le fichier web.xml
        // grace au servlet mapping
        request.getRequestDispatcher("/WEB-INF/pagePersonne.jsp").forward(request, response);
        // la servlette solicite les donnees quand je me connecte a la base aussi et
        // enfin la servlette route vers la page

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    // @Override
    // public void doDelete(HttpServletRequest request, HttpServletResponse
    // response)
    // throws ServletException, IOException {
    // processRequest(request, response);
    // }

    // @Override
    // public void doPut(HttpServletRequest request, HttpServletResponse response)
    // throws ServletException, IOException {
    // processRequest(request, response);
    // }

}
