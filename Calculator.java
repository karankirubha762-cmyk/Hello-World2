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
        // feature branch behavior
        throw new IllegalArgumentException("b cannot be 0 [feature]");
    }
    // feature: return full precision (no rounding)
    return a / b;
}

}
