package com.est14.CabecerosRespuesta;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ExcelGenerationServlet", value = "/excel-servlet")
public class ExcelGenerationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // This is the response type for this servlet
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=example.xls");
        // Indicate no saved cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);

        // Deploy info to user
        PrintWriter out = response.getWriter();
        out.println("\tValues");
        out.println("\t3");
        out.println("\t4");
        out.println("Total\t=SUM(b2:b3)");
        out.close();
    }
}
