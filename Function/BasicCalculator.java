
abstract class Calculator {

    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract double divison(int a, int b);
}

class SimpleCalculator extends Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divison(int a, int b) {
        return (double) a / b;
    }
}

public class BasicCalculator {
    public static void main(String args[]) {

        Calculator calc = new SimpleCalculator();

        int a = 20;
        int b = 10;
        System.out.println("Using abstract keyword and SimpleCalculator");
        System.out.println("Addition : " + calc.add(a, b));
        System.out.println("Subtraction : " + calc.subtract(a, b));
        System.out.println("Multiplication : " + calc.multiply(a, b));
        System.out.println("Division : " + calc.divison(a, b));
    }
}
