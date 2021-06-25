package test;

import data.DAOPerson;
import data.DAOPersonJDBC;
import domain.DTOPerson;

import java.sql.SQLException;
import java.util.List;

public class TestHandlePerson {

    public static void main(String[] args) {
        DAOPerson person = new DAOPersonJDBC();
        try {
            List<DTOPerson> people = person.select();
            people.forEach(p -> {
                System.out.println(p);
            });
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
