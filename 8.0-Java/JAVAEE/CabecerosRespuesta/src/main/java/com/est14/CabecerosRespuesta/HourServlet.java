package com.est14.CabecerosRespuesta;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name="HourServlet", value="/hour-servlet")
public class HourServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("txt/html;charset=UTF-8");
        response.setHeader("refresh", "1");
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("'Update Hour:' HH:mm:ss");
        String fH = df.format(date);

        PrintWriter out = response.getWriter();
        out.println("<h1>" + fH + "</h1>");
        out.close();
    }
}
