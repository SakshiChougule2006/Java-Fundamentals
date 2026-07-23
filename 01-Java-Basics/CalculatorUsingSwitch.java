import java.util.Scanner;

public class CalculatorUsingSwitch 
{

    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();

        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        System.out.print("Enter the operator (+, -, *, /, %): ");
        char op = in.next().charAt(0);

        switch (op) 
        {

            case '+':
                System.out.println("Addition = " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction = " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication = " + (a * b));
                break;

            case '/':
                if (b != 0) 
                {
                    System.out.println("Division = " + (a / b));
                }
                 else
                {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            case '%':
                if (b != 0) 
                {
                    System.out.println("Modulus = " + (a % b));
                } 
                else 
                {
                    System.out.println("Modulus by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator!");
        }

        
    }
}