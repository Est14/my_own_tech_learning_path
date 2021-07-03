package com.est14.ManejoCabeceros;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        String methodHttp = request.getMethod();
        //Uri is like URL
        String uri = request.getRequestURI();
        // Get all headers avalible
        Enumeration headers = request.getHeaderNames();


        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + "Handle Headers" + "</h1>");
        out.println("<h3>" + "Method: " + methodHttp + "</h3>");
        out.println("<h3>" + "Uri: " + uri + "</h3>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    public void destroy() {
    }
}