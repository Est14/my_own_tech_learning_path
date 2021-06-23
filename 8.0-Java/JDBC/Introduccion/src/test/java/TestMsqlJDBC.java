import java.sql.Connection;
import java.sql.*;


public class TestMsqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_test?useSSL=false&" +
                "useTimezone=true&" +
                "serverTimezone=UTC&" +
                "allowPublicKeyRetrieval=true";

        try {
            Connection connection = DriverManager.getConnection(url, "root", "Uri14!");
            Statement instructionStatement = connection.createStatement();
            var sql = "SELECT * FROM persona";
            ResultSet rs = instructionStatement.executeQuery(sql);
            while (rs.next()){
                System.out.print("idPerson: " + rs.getInt("idpersona") + " Name: " + rs.getString("name"));
                System.out.print(" Phone: " + rs.getString("phone"));
                System.out.println();
            }
            rs.close();
            instructionStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Connection fail");
        }
    }
}
