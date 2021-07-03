package com.example.Estados;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        //Simulate right values
        String userOk = "Esteban";
        String passwordOk = "Camarad14_!";

        String user = request.getParameter("user");
        String password = request.getParameter("password");

        if(userOk.equals(user) && passwordOk.equals(password)){
            out.println("<h1> Data is ok </h1>");
            out.println("<br><br>");
            out.println("<h1> User: " + user + " </h1>");
            out.println("<h1> Password:  " + password + " </h1>");
        }else{
            response.sendError(response.SC_UNAUTHORIZED, "Incorrect credentials");
        }
        out.close();
    }


    public void destroy() {
    }
}