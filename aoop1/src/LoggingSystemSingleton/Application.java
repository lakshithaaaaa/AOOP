package LoggingSystemSingleton;

public class Application {

    public static void main(String[] args) {
        // Get the logger instance
        logger logger = LoggingSystemSingleton.logger.getInstance();

        // Use the logger to log messages
        logger.logInfo("Application started.");
        logger.logDebug("This is a debug message.");
        logger.logError("An error occurred while processing data.");

        // Demonstrate Singleton behavior
        logger anotherLogger = LoggingSystemSingleton.logger.getInstance();
        anotherLogger.logInfo("This is another info message.");

        // Check if both loggers are the same instance
        if (logger == anotherLogger) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
}
