package org.est14.webapp.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloServlet", value="/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int myNum = 1;
        out.println("<!DOCTYPE html>");
        out.println("<h1> Hello world from servlet </h1>");
        out.close();
    }
}
