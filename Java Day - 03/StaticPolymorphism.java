// This program demonstrates static polymorphism in Java.
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
}

public class StaticPolymorphism {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Sum of 2 and 3: " + obj.add(2, 3));
        System.out.println("Sum of 1, 2 and 3: " + obj.add(1, 2, 3));
        System.out.println("Sum of 1.5 and 2.5: " + obj.add(1.5, 2.5));
    }
}