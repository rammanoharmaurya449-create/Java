import java.util.Scanner;

class Arithmetic {
    int a, b, choice;

    Arithmetic(int a, int b, int choice) {
        this.a = a;
        this.b = b;
        this.choice = choice;
    }

    void calculate() {
        switch (choice) {
            case 1:
                System.out.println("Addition is: " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction is: " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication is: " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Division is: " + (a / b));
                else
                    System.out.println("Division not possible");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

public class ArithmeticDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Arithmetic obj = new Arithmetic(a, b, choice);
        obj.calculate();

        sc.close();
    }
}
