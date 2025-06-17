/**
 * DevOpsWorld class prints a friendly message.
 * This class demonstrates basic Java structure and console output.
 */
public class DevOpsWorld {

    public static void main(String[] args) {
        // Externalized message for better maintainability
        String message = "Hello from DevOps World!";
        System.out.println(message);

        // Optionally print user-provided args with basic validation
        if (args != null && args.length > 0) {
            System.out.println("User input: " + sanitizeInput(args[0]));
        }
    }

    // Basic sanitization example
    private static String sanitizeInput(String input) {
        return input.replaceAll("[^a-zA-Z0-9 ]", "");
    }
}
