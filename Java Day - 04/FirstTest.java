class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
    
    // Method to add three double values
    double add(double a, double b, double c) {
        return a + b + c;
    }
    
}

public class FirstTest {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        double double3 = scanner.nextDouble();
        scanner.close();

        Calculator obj = new Calculator();
        System.out.println("Sum of " + num1 + " and " + num2 + ": " + obj.add(num1, num2));
        System.out.println("Sum of " + num1 + ", " + num2 + " and " + num3 + ": " + obj.add(num1, num2, num3));
        System.out.println("Sum of " + double1 + " and " + double2 + ": " + obj.add(double1, double2));
        System.out.println("Sum of " + double1 + ", " + double2 + " and " + double3 + ": " + obj.add(double1, double2, double3));
        
        
    }
}
