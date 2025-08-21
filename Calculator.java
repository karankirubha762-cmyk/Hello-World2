public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
    if (b == 0) {
        // final agreed behavior
        throw new ArithmeticException("Cannot divide by zero");
    }
    // keep rounding from master (or remove if you prefer)
    return Math.round((a / b) * 100.0) / 100.0;
    }

}
