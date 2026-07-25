import java.util.Scanner;
public class ArmstrongNumber
{
     public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n=in.nextInt();
        int sum = 0;
        int digit;
        int original;
        original=n;
        while(n!=0)
        {
            digit=n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
        }
        System.out.println("Sum = " + sum);
        if(sum==original)
        {
            System.out.println("ArmstrongNumber");
        }
        else
        {
           System.out.println("Not ArmstrongNumber");
        }
    }
}