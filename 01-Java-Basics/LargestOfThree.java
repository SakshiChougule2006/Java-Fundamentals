import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = in.nextInt();

        System.out.print("Enter the second number: ");
        int b = in.nextInt();

        System.out.print("Enter the third number: ");
        int c = in.nextInt();

        if (a > b && a > c) {
            System.out.println("Largest number is: " + a);
        } 
        else if (b > a && b > c) {
            System.out.println("Largest number is: " + b);
        } 
        else if (c > a && c > b) {
            System.out.println("Largest number is: " + c);
        } 
        else if (a == b && b == c) {
            System.out.println("All numbers are equal.");
        } 
        else if (a == b && a > c) {
            System.out.println("First and Second numbers are equal and largest.");
        } 
        else if (a == c && a > b) {
            System.out.println("First and Third numbers are equal and largest.");
        } 
        else if (b == c && b > a) {
            System.out.println("Second and Third numbers are equal and largest.");
        }

        
    }
}