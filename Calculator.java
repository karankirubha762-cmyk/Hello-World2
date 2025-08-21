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
        // master branch behavior
        throw new ArithmeticException("Division by zero [master]");
    }
    // master: round to 2 decimals
    return Math.round((a / b) * 100.0) / 100.0;
}
}
