package test;

import data.ConnectionEst14;
import data.DAOPerson;
import domain.Person;

import java.sql.*;

public class TestHandlePerson {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = ConnectionEst14.getConnection();
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            DAOPerson DAOPerson = new DAOPerson(conn);
            Person person = new Person( "Dani", "Poveda", "girasol@gmail.com","3233282310");
            DAOPerson.update(person, 8);
            Person person2 = new Person( "Oscar", "Mususu", "musu@gmail.com","3134582310");
            DAOPerson.insert(person2);

            conn.commit();
            System.out.println("Commit success");

        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
            System.out.println("Rollback activated");
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
