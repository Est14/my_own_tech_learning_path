package data;

import domain.Person;
import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.*;

public class DAOPerson {

    private static final String SELECT_SQL = "SELECT * FROM persona";

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

}