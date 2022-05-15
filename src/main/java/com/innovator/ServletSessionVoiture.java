package com.innovator;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/voitures")
public class ServletSessionVoiture extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        ArrayList<String> voitures = new ArrayList<String>();
        voitures.add("petite voiture1");
        voitures.add("petite voiture2");
        voitures.add("petite voiture3");
        voitures.add("petite voiture4");
        voitures.add("petite voiture5");
        voitures.add("petite voiture6");

        HttpSession x = request.getSession();
        x.setAttribute("listeVoitures", voitures);
        request.getRequestDispatcher("/WEB-INF/pageSessionVoitures.jsp").forward(request, response);
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
