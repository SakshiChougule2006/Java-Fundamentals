import java.util.Scanner;

public class GradeCalculator 
{

    public static void main(String[] args) 
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int s1 = in.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int s2 = in.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int s3 = in.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int s4 = in.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int s5 = in.nextInt();

        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 90)
        {
            System.out.println("Grade = A+");
        } 
        else if (percentage >= 80) 
        {
            System.out.println("Grade = A");
        } 
        else if (percentage >= 70) 
        {
            System.out.println("Grade = B");
        } 
        else if (percentage >= 60) 
        {
            System.out.println("Grade = C");
        } 
        else if (percentage >= 50) 
        {
            System.out.println("Grade = D");
        } 
        else 
        {
            System.out.println("Grade = Fail");
        }

       
    }
}