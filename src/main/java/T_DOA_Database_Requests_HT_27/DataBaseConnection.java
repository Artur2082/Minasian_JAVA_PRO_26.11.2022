package T_DOA_Database_Requests_HT_27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private Connection connection;

    public DataBaseConnection() {
    }

    public Connection getConnection() {
        try {
            String password = "Velhjcnm0228";
            String userName = "root";
            String url = "jdbc:mysql://localhost:3306/dbtest";
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
        System.out.println("Connection closed !");
    }
}
