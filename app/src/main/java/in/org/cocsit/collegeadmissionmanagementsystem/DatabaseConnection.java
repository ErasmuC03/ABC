package in.org.cocsit.collegeadmissionmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Database connection parameters
    private static final String jdbcUrl = "jdbc:sqlserver://database-1.cvw4q0gg4agr.eu-north-1.rds.amazonaws.com:1433;databaseName=PRODUCT_APP;encrypt=true;trustServerCertificate=true;";
    private static final String username = "admin";
    private static final String password = "ErasmuC03";

    // Establish database connection
    public static Connection getConnection() throws SQLException {
        try {
            // Load SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Create connection
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new SQLException("Failed to connect to database");
        }
    }
}
