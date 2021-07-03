package com.example.shoppingCart;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="ShoppingServlet", value = "/sopping-servlet")
public class ShoppingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset:UTF-8");

        String newArticle = request.getParameter("article");

        HttpSession session = request.getSession();
        List<String> articles = (List<String>) session.getAttribute("articles");

        if(articles == null){
            articles = new ArrayList<String>();
            session.setAttribute("articles", articles);
        }

        if(newArticle != null && !newArticle.trim().equals("")){
            articles.add(newArticle);
        }

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>" + "List of articles" + "</h1>");
        for(String a : articles){
            out.println("<li>" + a + "</li>");
            out.println("<br>");
        }
        out.println("</body></html>");

    }
}
