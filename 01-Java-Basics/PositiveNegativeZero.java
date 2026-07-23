import java.util.Scanner;
public class PositiveNegativeZero
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number");
       int  a=in.nextInt();
        if(a>0)
        {
            System.out.println("The Number is Positive");
        }
        else if(a<0)
        {
            System.out.println("The Number is Negative");
        }
        else
        {
             System.out.println("0 is neither Positive nor Negative.");
        }
        
        
    }
}