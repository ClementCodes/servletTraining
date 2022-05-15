package com.innovator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletformulaire")
public class ServletFormulaire extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        // ----ici un test en priorite pour savoir si le dispatch part bien ou je le
        // souaite
        // pour avoir acces au page via le dispatcher et donc le servlet il faut que le
        // fichier se trouve dans dans webinf ici via l url via le service
        // http://localhost:8080/project_servlet/api configure dans le fichier web.xml
        // grace au servlet mapping
        request.getRequestDispatcher("/WEB-INF/recupFormulaire.jsp").forward(request, response);
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
