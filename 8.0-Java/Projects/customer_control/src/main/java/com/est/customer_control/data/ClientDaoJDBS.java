package com.est.customer_control.data;

import com.est.customer_control.domain.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDaoJDBS {

    private static final String SELECT_SQL = "SELECT * FROM client";
    private static final String SELECTED_SQL_BY_ID = "SELECT id_client, name, last_name, email, phone, balance " +
            "FROM client WHERE id_client = ?";
    private static final String INSERT_SQL = "INSERT INTO client(name, last_name, email, phone, balance)" +
            "VALUES(?, ?, ?, ?, ?)";
    private static final String UPDATE_SQL = "UPDATE client" +
            "SET name=?, last_name=?, email=?, phone=?, balance=? WHERE id_client=?";
    private static final String DELETE_SQL = "DELETE from client WHERE id_client=?";

    public List<Client> listCustomers() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Client client = null;
        List<Client> clientList = new ArrayList<>();
        try {
            conn = ConnectionOne.getConnection();
            ps = conn.prepareStatement(SELECT_SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idCustomer = rs.getInt("id_client");
                String name = rs.getString("name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phone");
                double balance = rs.getDouble("balance");
                client = new Client(idCustomer, name, lastName, email, phoneNumber, balance);
                clientList.add(client);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                ConnectionOne.close(rs);
                ConnectionOne.close(ps);
                ConnectionOne.close(conn);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return clientList;
    }

    public Client custom(Client client) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionOne.getConnection();
            ps = conn.prepareStatement(SELECT_SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (client.getIdCustomer() == rs.getInt("id_client")){
                    String name = rs.getString("name");
                    String lastName = rs.getString("last_name");
                    String email = rs.getString("email");
                    String phoneNumber = rs.getString("phone");
                    double balance = rs.getDouble("balance");
                    client.setName(name);
                    client.setLastName(lastName);
                    client.setEmail(email);
                    client.setPhone(phoneNumber);
                    client.setBalance(balance);
                    break;
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                ConnectionOne.close(rs);
                ConnectionOne.close(ps);
                ConnectionOne.close(conn);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return client;
    }

    public void insert(Client client){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = ConnectionOne.getConnection();
            ps = conn.prepareStatement(INSERT_SQL);
            ps.setString(1, client.getName());
            ps.setString(2, client.getLastName());
            ps.setString(3, client.getEmail());
            ps.setString(4, client.getPhone());
            ps.setDouble(5, client.getBalance());
            int num = ps.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            try {
                ConnectionOne.close(ps);
                ConnectionOne.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }
    }

    public void update(Client client){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionOne.getConnection();
            ps = conn.prepareStatement(UPDATE_SQL);
            ps.setString(1, client.getName());
            ps.setString(2, client.getLastName());
            ps.setString(3, client.getEmail());
            ps.setString(4, client.getPhone());
            ps.setDouble(5, client.getBalance());
            ps.setInt(6, client.getIdCustomer());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            try {
                ConnectionOne.close(rs);
                ConnectionOne.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public void delete(Client client){
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionOne.getConnection();
            ps = conn.prepareStatement(DELETE_SQL);
            ps.setInt(1, client.getIdCustomer());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            try {
                ConnectionOne.close(ps);
                ConnectionOne.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
