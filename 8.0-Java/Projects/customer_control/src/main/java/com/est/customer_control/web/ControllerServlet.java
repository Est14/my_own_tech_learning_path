package com.est.customer_control.web;

import com.est.customer_control.data.ClientDaoJDBS;
import com.est.customer_control.domain.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ControllerServlet", value = "/controller-servlet")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action1 = request.getParameter("action");

        if (action1 != null) {
            if(action1.equals("edit"))
                this.edit(request, response);
            else{
                this.defaultAction(request, response);
            }
        } else {
            this.defaultAction(request, response);
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idClient = Integer.parseInt(request.getParameter("idClient"));
        Client client = new ClientDaoJDBS().custom(new Client(idClient));
        request.setAttribute("client", client);
        String jspEdit = "/WEB-INF/pages/client/editClient.jsp";
        request.getRequestDispatcher(jspEdit).forward(request, response);
    }

    private void defaultAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Client> clients = new ClientDaoJDBS().listCustomers();
        HttpSession session = request.getSession();
        session.setAttribute("clients", clients);
        session.setAttribute("totalClients", clients.size());
        session.setAttribute("totalBalance", balanceCal(clients));
        //request.getRequestDispatcher("clients.jsp").forward(request, response);
        response.sendRedirect("clients.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action1 = request.getParameter("action");

        if (action1.equals("insert")) {
            this.insert(request, response);
        }


        this.defaultAction(request, response);

    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        double balance = Double.parseDouble(request.getParameter("balance"));

        Client client = new Client(name, lastName, email, phone, balance);
        new ClientDaoJDBS().insert(client);
    }

    public double balanceCal(List<Client> clients) {
        double balance = 0;
        for (Client x : clients) {
            balance += x.getBalance();
        }
        return balance;
    }
}
