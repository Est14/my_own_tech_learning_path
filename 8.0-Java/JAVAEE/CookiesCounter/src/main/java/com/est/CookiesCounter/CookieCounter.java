package com.est.CookiesCounter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="Cookie", value="/cookie-servlet")
public class CookieCounter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");

        Cookie[] cookies = request.getCookies();
        int count = 0;
        String message = null;

        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("WelcomeElliot")){
                    count = Integer.parseInt(c.getValue());
                    break;
                }
            }
        }

        count++;
        Cookie newCookie = new Cookie("WelcomeElliot", Integer.toString(count));
        newCookie.setMaxAge(2000);
        response.addCookie(newCookie);
        message = "This is your number " + count + " visit here";
        PrintWriter out = response.getWriter();
        out.print(message);

    }
}
