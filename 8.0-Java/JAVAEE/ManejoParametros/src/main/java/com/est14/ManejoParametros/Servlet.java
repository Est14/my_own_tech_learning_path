package com.est14.ManejoParametros;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet")
public class Servlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Read the params jsp form
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println("User: " + user + " Password: " + password);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Not refresh" + "</h1>");
        out.println("<h1>" + "User: " + user + "</h1>");
        out.println("<h1>" + "Password: " + password + "</h1>");
        out.println("</body></html>");
    }

}
