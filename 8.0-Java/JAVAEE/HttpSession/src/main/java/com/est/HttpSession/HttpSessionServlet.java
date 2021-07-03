package com.est.HttpSession;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HttpSessionServlet", value="/httpSession-servlet")
public class HttpSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");

        HttpSession session = request.getSession();
        Integer sessionCounter = (Integer) session.getAttribute("counter");
        String message = null;

        if(sessionCounter == null){
            sessionCounter = 1;
            message = "Welcome to Est14 page";
        }
        else{
            sessionCounter++;
            message = "Welcome back to Est14 page";
        }
        session.setAttribute("counter", sessionCounter);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Hey brother this is a secret space </h1>");
        out.println("<h2>" + message + "</h2>");
        out.println("<h3> Counter session: " + sessionCounter + "</h3>");
        out.println("<h3> Session ID: " + session.getId() + "</h3>");
        out.println("</body></html>");
        out.close();
    }
}
