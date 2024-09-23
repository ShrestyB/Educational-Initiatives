package utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtility {
    private static Logger logger = Logger.getLogger(LoggerUtility.class.getName());

    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public static void logError(String message, Exception e) {
        logger.log(Level.SEVERE, message + " Exception: " + e.getMessage(), e);
    }
}
