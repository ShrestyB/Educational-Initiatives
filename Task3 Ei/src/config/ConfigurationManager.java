package config;

import utils.LoggerUtility;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private AppConfig appConfig;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        // Initialize with default values
        this.appConfig = new AppConfig("your-api-key", "jdbc:mysql://localhost:3306/learning_platform", "/path/to/storage");
        LoggerUtility.logInfo("ConfigurationManager initialized.");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public AppConfig getAppConfig() {
        return appConfig;
    }
}
