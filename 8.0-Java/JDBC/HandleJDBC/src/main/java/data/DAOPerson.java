package data;

import domain.Person;
import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.*;

public class DAOPerson {

    private static final String SELECT_SQL = "SELECT * FROM persona";
    private static final String INSERT_SQL = "INSERT INTO persona(`name`, lastname, email, phone)" +
            "VALUES(?, ?, ?, ?)";
    private static final String UPDATE_SQL = "UPDATE persona SET `name` = ?, lastname = ?, email = ?, phone = ? " +
            "WHERE idpersona = ?";

    private static final  String DELETE_SQL = "DELETE FROM persona WHERE idpersona= ?";

    public List<Person> select(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Person person = null;
        List<Person> personList = new ArrayList<>();


        try {
            conn = ConnectionEst14.getConnection();
            pstmt = conn.prepareStatement(SELECT_SQL);
            rs = pstmt.executeQuery();
            while (rs.next()){
                var idPerson = rs.getInt("idpersona");
                var name = rs.getString("name");
                var lastName = rs.getString("lastname");
                var email = rs.getString("email");
                var phone = rs.getString("phone");
                person = new Person(idPerson, name, lastName, email, phone);
                personList.add(person);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            try {
                ConnectionEst14.close(rs);
                ConnectionEst14.close(pstmt);
                ConnectionEst14.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return personList;
    }

    public int insert(Person person){
        int record = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = ConnectionEst14.getConnection();
            pstmt = conn.prepareStatement(INSERT_SQL);
            pstmt.setString(1, person.getName());
            pstmt.setString(2, person.getLastName());
            pstmt.setString(3, person.getEmail());
            pstmt.setString(4, person.getPhoneNumber());
            record = pstmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }finally{
            try {
                ConnectionEst14.close(pstmt);
                ConnectionEst14.close(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

        return  record;
    }

    public int update(Person person, int idpersona){
        int record = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = ConnectionEst14.getConnection();
            pstmt = conn.prepareStatement(UPDATE_SQL);
            pstmt.setString(1, person.getName());
            pstmt.setString(2, person.getLastName());
            pstmt.setString(3, person.getEmail());
            pstmt.setString(4, person.getPhoneNumber());
            pstmt.setInt(5, idpersona);
            record = pstmt.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return record;
    }

    public int delete(Person person){
        int record = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = ConnectionEst14.getConnection();
            pstmt = conn.prepareStatement(DELETE_SQL);
            pstmt.setInt(1, person.getIdPerson());
            record = pstmt.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return record;
    }

}