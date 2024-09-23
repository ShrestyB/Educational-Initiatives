package utils;

import java.util.logging.Logger;

public class LoggingUtility {
    private static Logger logger = Logger.getLogger(LoggingUtility.class.getName());

    public static void logInfo(String message) {
        logger.info(message);
    }

    public static void logError(String message, Exception e) {
        logger.severe(message + " Exception: " + e.getMessage());
    }
}
