package LoggingSystemSingleton;

public class logger {
    // Step 1: Create a private static instance of the class
    private static logger instance;

    // Step 2: Make the constructor private to prevent instantiation
    private logger() {
        // Initialize resources, if any
    }

    // Step 3: Provide a public static method to get the instance
    public static logger getInstance() {
        if (instance == null) {
            instance = new logger();
        }
        return instance;
    }

    // Step 4: Add logging methods
    public void logInfo(String message) {
        System.out.println("INFO: " + message);
    }

    public void logError(String message) {
        System.err.println("ERROR: " + message);
    }

    public void logDebug(String message) {
        System.out.println("DEBUG: " + message);
    }
}

