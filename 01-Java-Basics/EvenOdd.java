import java.util.Scanner;
public class EvenOdd
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number");
       int  a=in.nextInt();
        if(a%2==0)
        {
            System.out.println("The Number is Even");
        }
        else
        {
            System.out.println("The Number is Odd");
        }
        
    }
}