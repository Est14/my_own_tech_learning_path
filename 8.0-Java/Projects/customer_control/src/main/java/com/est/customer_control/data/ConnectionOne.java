package com.est.customer_control.data;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionOne {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/customer_control?useSSL=false" +
            "&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String  JDBC_USER = "root";
    private static final String JDBC_PASS = "Uri14!";

    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASS);
        ds.setInitialSize(50);
        return ds;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(PreparedStatement rs) throws SQLException {
        rs.close();
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
