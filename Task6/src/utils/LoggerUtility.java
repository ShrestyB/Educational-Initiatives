package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerUtility {

    private static final String LOG_FILE_PATH = "application.log";

    // Method to log informational messages
    public static void logInfo(String message) {
        log("INFO", message, null);
    }

    // Method to log warning messages
    public static void logWarning(String message) {
        log("WARNING", message, null);
    }

    // Method to log error messages with exception details
    public static void logError(String message, Exception exception) {
        log("ERROR", message, exception);
    }

    // Core logging method
    private static void log(String level, String message, Exception exception) {
        try (FileWriter writer = new FileWriter(LOG_FILE_PATH, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write(String.format("%s [%s]: %s%n", timestamp, level, message));

            // If an exception is provided, log its stack trace
            if (exception != null) {
                writer.write(String.format("Exception: %s%n", exception.getMessage()));
                for (StackTraceElement element : exception.getStackTrace()) {
                    writer.write(element.toString() + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }
}
