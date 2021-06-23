package data;

import domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOUser {

    private static final String INSERT_SQL = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM usuario";
    private static final String UPDATE_SQL = "UPDATE usuario SET usuario = ?, password = ? WHERE idusuario = ?";
    private static final String DELETE_SQL = "DELETE FROM usuario WHERE idusuario = ?";


    public int insert(User user){
        int record = 0;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionEst14.getConnection();
            ps = conn.prepareStatement(INSERT_SQL);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }finally{
            try {
                ps.close();
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }

        return record;
    }

    public int update(User user){
        int record = 0;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionEst14.getConnection();
            ps = conn.prepareStatement(UPDATE_SQL);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }finally{
            try {
                ps.close();
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }

        return record;
    }

    public int delete(User user){
        int record = 0;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = ConnectionEst14.getConnection();
            ps = conn.prepareStatement(DELETE_SQL);
            ps.setInt(1, user.getId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
        }finally{
            try {
                ps.close();
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace(System.out);
            }
        }

        return record;
    }

    public List<User> select(){

        List<User> userList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionEst14.getConnection();
            ps = conn.prepareStatement(SELECT_SQL);
            rs = ps.executeQuery();
            while (rs.next()){
                var idUser = rs.getInt("idusuario");
                var userT = rs.getString("usuario");
                var password = rs.getString("password");
                User user = new User(idUser, userT, password);
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return userList;

    }
}
