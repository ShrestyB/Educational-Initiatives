package config;

public class AppConfig {
    private String apiKey;
    private String databaseUrl;
    private String fileStoragePath;

    public AppConfig(String apiKey, String databaseUrl, String fileStoragePath) {
        this.apiKey = apiKey;
        this.databaseUrl = databaseUrl;
        this.fileStoragePath = fileStoragePath;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getFileStoragePath() {
        return fileStoragePath;
    }
}
