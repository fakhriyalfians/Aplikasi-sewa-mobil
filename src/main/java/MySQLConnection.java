import java.sql.*;

public class MySQLConnection {
    public static Connection getConnection() throws Exception {
        String dbConn = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "appsewamobil";

        String dbLink = dbConn + hostName + dbName;

        String hostUsername = "root";
        String dbPass = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbLink, hostUsername, dbPass);

        return conn;
    }
}
