package com.est.ManejoCookies;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieServlet", value = "/cookie-servlet")
public class CookieServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // User that visit the site for first time
        boolean newUser = true;

        // Get all cookies
        Cookie[] cookies = request.getCookies();

        // Search cookies that exist before
        // Recurrent user
        String message = null;
        if (cookies != null){
            for(Cookie c: cookies){
                if (c.getName().equals("RecurrentUser2") && c.getValue().equals("yes")){
                    newUser = false;
                    break;
                }
            }
            if(newUser){
                Cookie userVisit = new Cookie("RecurrentUser2", "yes");
                response.addCookie(userVisit);
                message = "Thanks for visiting our page for first time";
            }
            else {
                message = "Thank for welcome back";
            }
        }
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Message: " + message + "</h1");
        out.println("</body></html>");

    }
}
