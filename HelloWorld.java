public class HelloWorld {
    public static void main(String[] args) {
        Student s = new Student("Alice", 20);
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());

        System.out.println("2 + 3 = " + Calculator.add(2, 3));
        System.out.println("7 - 4 = " + Calculator.subtract(7, 4));
        System.out.println("6 * 5 = " + Calculator.multiply(6, 5));
        System.out.println("8 / 2 = " + Calculator.divide(8, 2));



    }
}
