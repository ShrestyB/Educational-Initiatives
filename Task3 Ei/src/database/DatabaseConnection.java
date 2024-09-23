package database;

import config.ConfigurationManager;
import utils.LoggerUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private Connection connection;

    public DatabaseConnection() {
        try {
            String dbUrl = ConfigurationManager.getInstance().getAppConfig().getDatabaseUrl();
            this.connection = DriverManager.getConnection(dbUrl);
            LoggerUtility.logInfo("Database connection established.");
        } catch (SQLException e) {
            LoggerUtility.logError("Failed to connect to the database.", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    // Add methods for closing the connection, executing queries, etc.
}
