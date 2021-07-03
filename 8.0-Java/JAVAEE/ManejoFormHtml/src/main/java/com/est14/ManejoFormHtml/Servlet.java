package com.est14.ManejoFormHtml;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("user");
        String password = request.getParameter("password");
        String technologies[] = request.getParameterValues("technology");
        String gender = request.getParameter("gender");
        String occupation = request.getParameter("occupation");
        String music[] = request.getParameterValues("music");
        String comments = request.getParameter("comments");

        out.println("<html><body>");
        out.println("<h1> Parameters procceced by servlet </h1>" );
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<td>");
        out.println("<h2> Name: </h2>");
        out.println("</td>");
        out.println("<td>");
        out.println("<h2>" + user + "</h2>");
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>");
        out.println("<h2> Password: </h2>");
        out.println("</td>");
        out.println("<td>");
        out.println("<h2>" + password + "</h2>");
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>");
        out.println("<h2> Technologies: </h2>");
        out.println("</td>");
        out.println("<td>");
        out.println("<h2>");
        for (String x1: technologies){
            out.println(x1);
        }
        out.println("</h2>");
        out.println("</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body></html>");



    }
}
