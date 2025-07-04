class Calculator {
    int a, b;
    Calculator() {
        a = 0;
        b = 0;
        System.out.println("Default constructor: a = 0, b = 0");
    }
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Addition: " + (a + b));
    }
    Calculator(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Addition: " + (a + b));
                break;
            case "subtract":
                System.out.println("Subtraction: " + (a - b));
                break;
            case "multiply":
                System.out.println("Multiplication: " + (a * b));
                break;
            case "divide":
                if (b != 0)
                    System.out.println("Division: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();                     
        Calculator c2 = new Calculator(10, 20);               
        Calculator c3 = new Calculator(15, 3, "multiply");    
    }
}
