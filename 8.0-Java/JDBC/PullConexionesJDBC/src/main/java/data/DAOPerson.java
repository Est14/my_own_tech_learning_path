package data;

import domain.DTOPerson;

import java.sql.SQLException;
import java.util.List;

public interface DAOPerson {

    public int insert (DTOPerson person) throws SQLException;
    public int update (DTOPerson person) throws SQLException;
    public int delete (DTOPerson person) throws SQLException;
    public List<DTOPerson> select() throws SQLException;
}
