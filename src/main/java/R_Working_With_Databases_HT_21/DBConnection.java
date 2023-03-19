package R_Working_With_Databases_HT_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection;

    public DBConnection() {
    }

    public Connection getConnection() {
        try {
            String password = "Velhjcnm0228";
            String userName = "root";
            String url = "jdbc:mysql://localhost:3306/dbtest";
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
        System.out.println("Connection closed !");
    }
}
