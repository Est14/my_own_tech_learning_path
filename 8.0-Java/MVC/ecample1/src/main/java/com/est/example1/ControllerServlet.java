package com.est.example1;

import com.est.example1.model.Rectangle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="controllerServlet", value="/controller-servlet")

public class ControllerServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. Process param
        String action1 = request.getParameter("action1");

        // 2. Create JavaBeans
        Rectangle rectRequest = new Rectangle(2, 6);
        Rectangle rectSession = new Rectangle(5, 3);
        Rectangle rectApplication = new Rectangle(7, 4);

        // 3. Add JavaBeans some scope

        if("addVariables".equals(action1)){
            // Request Scope
            request.setAttribute("rectRequest", rectRequest);

            // Session Scope
            HttpSession session = request.getSession();
            session.setAttribute("rectSession", rectSession);

            // Application Scope
            ServletContext application = this.getServletContext();
            application.setAttribute("rectApplication", rectApplication);

            request.setAttribute("message", "The variables was add");

            // 4. Redirect to home page
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else if ("listVariables".equals(action1)){
            //4. Sent to the JSP selected
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/scopeVariable.jsp");
            rd.forward(request, response);
        }
        else {
            // 4. Redirect to home page
            request.setAttribute("message", "Action not given");
            request.getRequestDispatcher("index.jsp").forward(request, response);

            // response.sendRedirect("index.jsp") This go to home without any information
        }
    }
}
