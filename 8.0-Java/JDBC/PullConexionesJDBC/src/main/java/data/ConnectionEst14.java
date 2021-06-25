package data;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Exploring Java Docs
 */
public class ConnectionEst14 {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/java_test?useSSL=false&" +
            "useTimezone=true&" +
            "serverTimezone=UTC&"  +
            "allowPublicKeyRetrieval=true";

    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "Uri14!";
    private static BasicDataSource dataSource;

    public static DataSource getDataSource(){
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setUrl(JDBC_URL);
            dataSource.setUsername(JDBC_USER);
            dataSource.setPassword(JDBC_PASS);
            dataSource.setInitialSize(50);
        }
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return  ConnectionEst14.getDataSource().getConnection();
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    /**
     * @param rs nothing to write here I just exploring.
     * @throws SQLException
     */
    public static void close(Statement rs) throws SQLException {
        rs.close();
    }

    public static void close(PreparedStatement rs) throws SQLException {
        rs.close();
    }

    public static void close(Connection rs) throws SQLException {
        rs.close();
    }
}
