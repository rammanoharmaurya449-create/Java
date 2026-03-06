// Superclass without exception declaration
class SuperClass1 {
    void method() {
        System.out.println("SuperClass method executed");
    }
}

// Subclass declaring an unchecked exception
class SubClass extends SuperClass1 {

    @Override
    void method() throws ArithmeticException {
        System.out.println("SubClass method executed");
        throw new ArithmeticException("Exception in SubClass");
    }

    public static void main(String[] args) {
        SuperClass1 s = new SubClass();

        try {
            s.method();
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
