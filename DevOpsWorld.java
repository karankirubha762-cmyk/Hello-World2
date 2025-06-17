/**
 * DevOpsWorld class prints a dynamic, sanitized message.
 * Demonstrates proper class naming, parameterization, and input safety.
 */
public class DevOpsWorld {

    public static void main(String[] args) {
        String baseMessage = "Welcome to DevOps World";
        String userMessage = "";

        if (args != null && args.length > 0) {
            userMessage = sanitizeInput(args[0]);  // Sanitize user input
        }

        // Print a dynamic and safe message
        System.out.println(baseMessage + (userMessage.isEmpty() ? "!" : ": " + userMessage));
    }

    /**
     * Sanitizes input by removing potentially dangerous characters.
     * Only allows letters, numbers, and basic punctuation.
     */
    private static String sanitizeInput(String input) {
        return input.replaceAll("[^a-zA-Z0-9 .,!?]", "");
    }
}
