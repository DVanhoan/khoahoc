package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static MySQLConnection instance = null;

    private static final String HOST = "localhost";
    private static final int PORT = 3306;
    private static final String DB_NAME = "doancoso1";
    private static final String USER = "root";
    private static final String PASSWORD = "duongvanhoan22082005";

    private Connection connection;

    private MySQLConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL driver not found");
            e.printStackTrace();
            return;
        }
        String dbUrl = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME + "?user=" + USER + "&password=" + PASSWORD + "&serverTimezone=UTC";
        connection = DriverManager.getConnection(dbUrl);
        System.out.println("Connected");
    }

    public static synchronized MySQLConnection getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new MySQLConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public static void main(String[] args) {
        try {
            Connection connection = MySQLConnection.getInstance().getConnection();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
