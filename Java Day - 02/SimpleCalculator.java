import java.util.Scanner;

class Calculator {

    void add(double num1, double num2) {
        System.out.println("The sum of two number is : " + (num1 + num2));
    }

    void subtract(double num1, double num2) {
        System.out.println("The sub of two number is : " + (num1 - num2));
    }

    void multiply(double num1, double num2) {
        System.out.println("The multification of two number is : " + (num1 * num2));
    }

    void divide(double num1, double num2) {
        if (num2 != 0)
            System.out.println("The division of two number is : " + (num1 / num2));
        else
            System.out.println("Error! Division by zero.");
    }
}

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = myInput.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = myInput.nextDouble();

        
        Calculator obj = new Calculator();
        obj.add(num1, num2);
        obj.subtract(num1, num2);
        obj.multiply(num1, num2);
        obj.divide(num1, num2);
        myInput.close();
    }
}