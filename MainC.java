

import java.util.Scanner;

class Calculator {
    protected double num1;
    protected double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}

class Addition extends Calculator { 
    public Addition(double num1, double num2) {
        super(num1, num2);
    }

    public void add() {
        double result = num1 + num2;
        displayResult(result);
    }
}

class Subtraction extends Calculator {
    public Subtraction(double num1, double num2) {
        super(num1, num2);
    }

    public void subtract() {
        double result = num1 - num2;
        displayResult(result);
    }
}

class Multiplication extends Calculator {
    public Multiplication(double num1, double num2) {
        super(num1, num2);
    }

    public void multiply() {
        double result = num1 * num2;
        displayResult(result);
    }
}

class Division extends Calculator {
    public Division(double num1, double num2) {
        super(num1, num2);
    }

    public void divide() {
        if (num2 != 0) {
            double result = num1 / num2;
            displayResult(result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

public class MainC{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                Addition addition = new Addition(num1, num2);
                addition.add();
                break;
            case '-':
                Subtraction subtraction = new Subtraction(num1, num2);
                subtraction.subtract();
                break;
            case '*':
                Multiplication multiplication = new Multiplication(num1, num2);
                multiplication.multiply();
                break;
            case '/':
                Division division = new Division(num1, num2);
                division.divide();
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                break;
        }

        scanner.close();
    }
}
