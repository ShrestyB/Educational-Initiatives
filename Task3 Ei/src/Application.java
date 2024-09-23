import config.ConfigurationManager;
import database.DatabaseConnection;

public class Application {

    public static void main(String[] args) {
        // Accessing the singleton instance of ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Displaying configuration values
        System.out.println("API Key: " + configManager.getAppConfig().getApiKey());
        System.out.println("Database URL: " + configManager.getAppConfig().getDatabaseUrl());
        System.out.println("File Storage Path: " + configManager.getAppConfig().getFileStoragePath());

        // Testing Database Connection
        DatabaseConnection dbConnection = new DatabaseConnection();
        System.out.println("Database Connection: " + (dbConnection.getConnection() != null));
    }
}
